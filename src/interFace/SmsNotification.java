package interFace;

public class SmsNotification  implements Notification{

	@Override
	public void send(String message) {
		System.out.println("send sms: "+ message);
		
	}

}
