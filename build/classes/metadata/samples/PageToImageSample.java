/*
 * Copyright (c) 2000-2014 TeamDev Ltd. All rights reserved.
 * TeamDev PROPRIETARY and CONFIDENTIAL.
 * Use is subject to license terms.
 */

import com.teamdev.jxdocument.Document;
import com.teamdev.jxdocument.Page;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

/**
 * The sample demonstrates how to load specified PDF document and get image of its first page.
 */
public class PageToImageSample {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\TeamDev.pdf");
        // Load PDF document from specified file
        Document document = new Document(file);
        // Get total number of pages
        int pagesCount = document.getPageCount();
        if (pagesCount > 0) {
            // Get first Page
            Page page = document.getPageAt(0);
            // Get Page size in pixels
            Dimension pageSize = page.getSize();
            // Get Image of the page with specified width and height
            Image pageImage = page.convertToImage(pageSize.width, pageSize.height);
            // Save Image into PNG file.
            ImageIO.write((RenderedImage) pageImage, "PNG", new File("TeamDev-1.png"));
            // Close Page to release allocated resources and memory
            page.close();
        }
        // Close document to release all allocated resources and memory
        document.close();
    }
}
