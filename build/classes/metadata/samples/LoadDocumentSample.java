/*
 * Copyright (c) 2000-2014 TeamDev Ltd. All rights reserved.
 * TeamDev PROPRIETARY and CONFIDENTIAL.
 * Use is subject to license terms.
 */

import com.teamdev.jxdocument.Document;

import java.io.File;

/**
 * The sample demonstrates how to load PDF document from specified file and
 * print number of pages.
 */
public class LoadDocumentSample {
    public static void main(String[] args) {
        File file = new File("C:\\TeamDev.pdf");
        // Load PDF document from specified file
        Document document = new Document(file);
        // Print total number of pages in the loaded document
        System.out.println("Page Count: " + document.getPageCount());
        // Close document to release all allocated resources and memory
        document.close();
    }
}
