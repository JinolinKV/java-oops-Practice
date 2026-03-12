package interFace;


public class SendNotification {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Notification n1= new EmailNotification();
		n1.send("order has been placed successfully \n Thankyou for shopping with us..");
		
		Notification n2= new SmsNotification();
		n2.send("share this opt:9756, when delevery partner is at your door step...");
		
		
	}

}
