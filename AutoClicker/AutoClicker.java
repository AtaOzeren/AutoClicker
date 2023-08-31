import java.awt.*;
import java.awt.event.InputEvent;

public class AutoClicker {
	public static void main(String[] args) {
		try {
			while (true) {
				Robot r = new Robot();
				int button = InputEvent.BUTTON1_DOWN_MASK;
				System.out.println("Click");
				r.mousePress(button);
				Thread.sleep(400);
				r.mouseRelease(button);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}