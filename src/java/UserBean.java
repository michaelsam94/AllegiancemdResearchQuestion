
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;

@ManagedBean(name="user")
@SessionScoped
public class UserBean implements Serializable {
        
	private String userName;
        private static final ArrayList<User> users = new ArrayList<>();

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
        
        public ArrayList<User> getUsers(){
            return users;
        }
        
        public String addUser(){
            User user = new User(this.userName);
            users.add(user);
            return null;
        }
        
     
    public static class User{
        String name;
        public User(String name){
            this.name = name;
        }
        
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        
    }
}
