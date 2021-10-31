import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Task2 {
	
	public static void main(String[] args) throws IOException {
		BufferedImage bi = ImageIO.read(new File("example.png"));
		BufferedImage bi2 = new BufferedImage(bi.getWidth(), bi.getHeight(),BufferedImage.TYPE_INT_RGB);

		for (int x = 0; x < bi.getHeight(); x++) {
			for (int y = 0; y < bi.getWidth(); y++) {
				Color c = new Color(bi.getRGB(y, x));
				if (c.getRed() <= 32) {
					bi2.setRGB(y, x, 0x202020);
				}
				else if (c.getRed() <= 64){
					bi2.setRGB(y, x, 0x404040);
				}
				else if (c.getRed() <= 96){
					bi2.setRGB(y, x, 0x606060);
				}
				else if (c.getRed() <= 128){
					bi2.setRGB(y, x, 0x808080);
				}
				else if (c.getRed() <= 160){
					bi2.setRGB(y, x, 0xa0a0a0);
				}
				else if (c.getRed() <= 192){
					bi2.setRGB(y, x, 0xc0c0c0);
				}
				else if (c.getRed() <= 224){
					bi2.setRGB(y, x, 0xe0e0e0);
				}
				else {
					bi2.setRGB(y, x, 0xffffff);
				}				
			}
		}
		System.out.println(ImageIO.write(bi2, "png", new File("quantized.png")));
	}

}
