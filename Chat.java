package behav;

import java.sql.Date;

public class Chat
{
	 public static void showMessage(User user, String message)
	 {
	        System.out.println(new Date(0).toString() + "[" + user.getName() + "]: " + message);
	   }
}
