//package com.example.demo.Bean;
//
//import com.itextpdf.layout.Document;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.Barcode128;
//import com.itextpdf.text.pdf.PdfContentByte;
//import com.itextpdf.text.pdf.PdfWriter;
//
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.FileOutputStream;
//
//public class PDDFBARCODELAST {
//    public static void main(String[] args) {
//        String RESULT = "c:/BarCodeQRCodeGenerator/barcodes.pdf";
//        Document document = new Document(new Rectangle(340, 842));
//        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(RESULT));
//        document.open();
//        PdfContentByte cb = writer.getDirectContent();
//        document.add(new Paragraph("Barcode 128"));
//        Barcode128 code128 = new Barcode128();
//        code128.setCode("1234567890");
//        Image image = code128.createImageWithBarcode(cb, null, null)
//        document.add(image);
//
//        java.awt.Image rawImage = code128.createAwtImage(Color.BLACK, Color.WHITE);
//        BufferedImage outImage = new BufferedImage(rawImage.getWidth(null), rawImage.getHeight(null), BufferedImage.TYPE_INT_RGB);
//        outImage.getGraphics().drawImage(rawImage, 0, 0, null);
//        ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
//        ImageIO.write(outImage, "png", bytesOut);
//        bytesOut.flush();
//
//        byte[] pngImageData = bytesOut.toByteArray();
//        FileOutputStream fos = new FileOutputStream("c:/BarCodeQRCodeGenerator/barcode.png");
//        fos.write(pngImageData);
//        fos.close();
//    }
//}
