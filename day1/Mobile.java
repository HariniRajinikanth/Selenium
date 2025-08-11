package week1.day1;

public class Mobile {

		 // First method
	    public void makeCall() {
	        String mobileModel = "Samsung Galaxy S23";
	        float mobileWeight = 174.5f;
	        System.out.println("Making a call...");
	        System.out.println("Mobile Model: " + mobileModel);
	        System.out.println("Mobile Weight: " + mobileWeight + " grams");
	    }

	    // Second method
	    public void sendMsg() {
	        boolean isFullCharged = true;
	        int mobileCost = 65000;
	        System.out.println("Sending a message...");
	        System.out.println("Is fully charged: " + isFullCharged);
	        System.out.println("Mobile Cost: ₹" + mobileCost);
	    }

		public static void main(String[] args) {
			 Mobile myMobile = new Mobile();
		        myMobile.makeCall();
		        myMobile.sendMsg();
		        System.out.println("This is my mobile");


	}

}
