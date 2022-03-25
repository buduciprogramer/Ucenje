package hrana;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



public class MainResize2 {

    public static void main(String[] args) {
File jpgOriginal=new File("C:\\Users\\PC\\Desktop\\hotdog.jpg");
File jpgResized=new File("C:\\Users\\PC\\Desktop\\resized.jpg");
resizeImage(jpgOriginal,jpgResized,100,100,"jpg");
    }

    private static void resizeImage(File OriginalImage,File ResizedImage,int width,int height,String format){
        try {
            BufferedImage original= ImageIO.read(OriginalImage);
            BufferedImage resized=new BufferedImage(width,height,original.getType());
            Graphics2D graphics2D=resized.createGraphics();
            graphics2D.drawImage(original,0,0,width,height,null);
            graphics2D.dispose();
            ImageIO.write(resized,format,ResizedImage);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }



}




