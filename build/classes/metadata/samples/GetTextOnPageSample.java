/*
 * Copyright (c) 2000-2014 TeamDev Ltd. All rights reserved.
 * TeamDev PROPRIETARY and CONFIDENTIAL.
 * Use is subject to license terms.
 */

import com.teamdev.jxdocument.Document;
import com.teamdev.jxdocument.Page;
import com.teamdev.jxdocument.Text;

import java.io.File;

/**
 * The sample demonstrates how to get text on specified Page.
 */
public class GetTextOnPageSample {
    public static void main(String[] args) {
        File file = new File("C:\\TeamDev.pdf");
        // Load PDF document from specified file
        Document document = new Document(file);
        // Get total number of pages
        int pagesCount = document.getPageCount();
        if (pagesCount > 0) {
            // Get first Page
            Page page = document.getPageAt(0);
            // Access text presentation of the Page
            Text pageText = page.getText();
            // Print all text on the Page
            System.out.println(pageText.getText());
            // Close page to release allocated resources and memory
            page.close();
        }
        // Close document to release all allocated resources and memory
        document.close();
    }
}
