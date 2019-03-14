//https://sites.google.com/a/teamdev.com/jxdocument-support/samples
//http://elpaladintecnologico.blogspot.com/2014/11/como-leer-informacion-del-pdf-y.html


import com.teamdev.jxdocument.Document;
import com.teamdev.jxdocument.Page;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class PageToImageSample {
    private static void main(String[] args) throws IOException {
        JFileChooser file = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        //Dialogo que permite mostrar la ventana para seleccionar el archivo.
        file.showOpenDialog(file);

        //crear variable tipo File que obtiene el archivo seleccionado
        File archivo = file.getSelectedFile();
        Document document = new Document(archivo);
        // Get total number of pages
        int pageCount = document.getPageCount();
        if (pageCount > 0) {
            // Get first Page
            Page page = document.getPageAt(0);
            // Get Page size in pixels
            Dimension pageSize = page.getSize();
            // Get Image of the page with specified width and height
            Image pageImage = page.convertToImage(pageSize.width, pageSize.height);
            // Save Image into PNG file.
            ImageIO.write((RenderedImage) pageImage, "PNG", new File("TeamDev-1.png"));
        }
        // Close document to release all allocated resources and memory
        document.close();
    }
}