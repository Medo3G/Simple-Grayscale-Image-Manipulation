import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;

public class Task1 {

	public static void main(String[] args) throws IOException {
		BufferedImage bi = ImageIO.read(new File("example.png"));
		PrintWriter writer = new PrintWriter("Grayscale.txt", "UTF-8");

		for (int x = 0; x < bi.getHeight(); x++) {
			for (int y = 0; y < bi.getWidth(); y++) {
				Color c = new Color(bi.getRGB(y, x));
				writer.print("[" + c.getRed() + "] ");
			}
			writer.println();
		}
		writer.close();

	}

}
