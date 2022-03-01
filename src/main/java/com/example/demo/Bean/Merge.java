package com.example.demo.Bean;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.RectangleReadOnly;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;

import java.io.*;

public class Merge {
    public static void main(String[] args) throws IOException, DocumentException {

        String originalPdfFile="C:\\Users\\nando\\Desktop\\simple.pdf";
        String outputPdfFile="C:\\Users\\nando\\Desktop\\simple2.pdf";

        mergeTwoPagesIntoOne(originalPdfFile,outputPdfFile);

//        File file1 = new File(
//                "C:\\Users\\nando\\Desktop\\simple.pdf");
//        File file2 = new File(
//                "C:\\Users\\nando\\\\Desktop\\simple2.pdf");
//
//        // Instantiating PDFMergerUtility class
//
//        PDFMergerUtility obj = new PDFMergerUtility();
//
//
//
//        obj.setDestinationFileName(
//                "C:\\Users\\nando\\Desktop\\newMerged.pdf");
//
//        obj.addSource(file1);
//        obj.addSource(file2);
//
//        // Merging documents
//
//        obj.mergeDocuments();
    }
    public static void mergeTwoPagesIntoOne(String originalPdfFile, String outputPdfFile) throws IOException, DocumentException {
        PdfReader reader = new PdfReader(originalPdfFile);
        Document doc = new Document(new RectangleReadOnly(842f, 595f), 0, 0, 300, 0);
        PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(outputPdfFile));
        doc.open();
        int totalPages = reader.getNumberOfPages();
        for (int i = 1; i <= totalPages; i = i + 2) {
            doc.newPage();
            PdfContentByte cb = writer.getDirectContent();
            PdfImportedPage page = writer.getImportedPage(reader, i); // page #1

            float documentWidth = doc.getPageSize().getWidth() / 2;
            float documentHeight = doc.getPageSize().getHeight();
            if (i > 1)
                documentHeight = documentHeight - 50f;

            float pageWidth = page.getWidth();
            float pageHeight = page.getHeight();

            float widthScale = documentWidth / pageWidth;
            float heightScale = documentHeight / pageHeight;
            float scale = Math.min(widthScale, heightScale);

            float offsetX = (documentWidth - (pageWidth * scale)) / 2;
            float offsetY = 0f;

            cb.addTemplate(page, scale, 0, 0, scale, offsetX, offsetY);

            if (i+1 <= totalPages) {
                PdfImportedPage page2 = writer.getImportedPage(reader, i+1); // page #2

                pageWidth = page.getWidth();
                pageHeight = page.getHeight();

                widthScale = documentWidth / pageWidth;
                heightScale = documentHeight / pageHeight;
                scale = Math.min(widthScale, heightScale);

                offsetX = ((documentWidth - (pageWidth * scale)) / 2) + documentWidth;
                cb.addTemplate(page2, scale, 0, 0, scale, offsetX, offsetY);
            }
        }
        doc.close();


    }
}
