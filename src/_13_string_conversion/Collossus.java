package _13_string_conversion;

import java.util.Random;

import javax.swing.JOptionPane;

public class Collossus {
	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog("How many inches tall are you?"));
		if (num > 48) {
			System.out.print("You can Ride!");
		} else {
			System.out.print("You can not ride");
		}
		int Magic = new Random().nextInt(51);
if (Magic>26){
			System.out.print("I know you are lying!");
		}

	}
}
