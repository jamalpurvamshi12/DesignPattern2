package behav;


public class MainBridge
{
		    public static void main(String[] args)
		    {
		        User david = new User("facebook");
		        User scott = new User("Whatsapp");
		        
		        david.sendMessage("Hi sup! How are you?");
		        scott.sendMessage("I'm great! Thanks for asking. How are you?");
		        
		    }
}

