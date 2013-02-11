package remotehid.remotehidserver;

import java.io.IOException;

import org.flypad.joystick.Joystick;
import org.flypad.joystick.JoystickException;

public class RemoteHid {
	
	public static void  main(String args[]) throws IOException, InterruptedException {
		
		try {
	        /*
	         * Try to create a new joystick.
	         */
	        Joystick joystick = new Joystick();
	        int x = Joystick.ANALOG_MIN;

	        try {
	            
	            
	            while(true) {
	            	
	            	/*
		             * Set joystick values
		             */

		            /*
		             * Set analog values for Axis X/Y/Z,
		             * Rotation X/Y/Z, Slider, Dial. Overall 8 axes.
		             * 
		             * Here we set the Z Axis to maximum.
		             */
	            	/*if(x >= Joystick.ANALOG_MAX){
	            		x = Joystick.ANALOG_MIN;
	            	}
	            	x++;*/
		            //joystick.analog[Joystick.ANALOG_AXIS_Z] = Joystick.ANALOG_MID;
		            //joystick.analog[Joystick.ANALOG_AXIS_Y] = Joystick.ANALOG_MID;
		            //joystick.analog[Joystick.ANALOG_AXIS_X] = Joystick.ANALOG_MID;

		            /*
		             * Set digital values for the buttons. Overall 16 buttons.
		             *
		             * Here we turn on the 13-th button
		             */
		            //joystick.digital[12] = Joystick.DIGITAL_ON;
	            	//look forward
		            //joystick.digital[0] = Joystick.DIGITAL_ON;
		            //joystick.digital[1] = Joystick.DIGITAL_ON;
		            //joystick.digital[2] = Joystick.DIGITAL_ON;
		            joystick.digital[2] = Joystick.DIGITAL_ON;
	            	//look back
		            //joystick.digital[4] = Joystick.DIGITAL_ON;
		            //joystick.digital[5] = Joystick.DIGITAL_ON;
		            //joystick.digital[6] = Joystick.DIGITAL_ON;
		            //joystick.digital[7] = Joystick.DIGITAL_ON;
		            //joystick.digital[8] = Joystick.DIGITAL_ON;
		            //joystick.digital[9] = Joystick.DIGITAL_ON;
		            //joystick.digital[12] = Joystick.DIGITAL_ON;
		            

		            /*
		             * Send the data to the joystick. Keep in mind,
		             * that the send method may throw a JoystickException
		             */
		            joystick.send();
		           
		            
		            System.out.println("Joystick message was sent");
		            Thread.sleep(500);
	            }
	            
	            
	            
	        } finally {
	            joystick.close();
	        }
	    } catch (JoystickException e) {
	        e.printStackTrace();
	    }
		
	}

}
