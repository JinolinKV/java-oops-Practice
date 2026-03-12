package interFace;

public class EmailNotification implements Notification{

	@Override
	public void send(String message) {
		System.out.println("sending email: "+ message);
		
	}

}
