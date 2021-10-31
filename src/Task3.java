import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Task3 {
	
	public static void main(String[] args) throws IOException {
		BufferedImage bi = ImageIO.read(new File("example.png"));
		int[] histogram = new int[256];
		
		for (int x = 0; x < bi.getWidth(); x++) {
			for (int y = 0; y < bi.getHeight(); y++) {
				Color c = new Color(bi.getRGB(x, y));
				histogram[c.getRed()]++;				
			}			
		}
		for (int i = 0; i < histogram.length; i++) {
			System.out.println("Colour " + i + " occurs " + histogram[i] + " times.");
		}
		

	}

}
