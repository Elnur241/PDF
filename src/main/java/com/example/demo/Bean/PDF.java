package com.example.demo.Bean;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Document;

import com.itextpdf.layout.Style;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.borders.DoubleBorder;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.*;

import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.RectangleReadOnly;
import com.itextpdf.text.pdf.BaseFont;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDFontFactory;
import org.apache.pdfbox.pdmodel.font.PDTrueTypeFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;


import javax.swing.text.StyleConstants;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PDF {
    public static final String azeri = "arial.ttf";

    public static void main(String[] args) throws IOException, DocumentException {

        String path = "C:\\Users\\nando\\Desktop\\simple.pdf";
        PdfWriter pdfwriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfwriter);


        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document = new Document(pdfDocument);
        Paragraph paragraph = new Paragraph();
        Style style = new Style();
        style.setFontSize(14f).setMarginLeft(150f).setBold().setMarginBottom(20f);
        PdfFont pdfFont = PdfFontFactory.createFont(azeri);


        float columnWidt0[] = {280f, 280f};
        Table table0 = new Table(columnWidt0).setFont(pdfFont);
        table0.addCell(new Cell(0, 2).add(new Paragraph("ƏMƏK MÜQAVİLƏSİNİN BAĞLANMASI İLƏ BAĞLI:").setTextAlignment(TextAlignment.CENTER).setFont(pdfFont)).setPaddingTop(10).setTextAlignment(TextAlignment.LEFT).setFontSize(14).setBold().setBorder(Border.NO_BORDER)).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderTop(new DoubleBorder(new DeviceRgb(53, 165, 214), 1));
        table0.addCell(new Cell(0, 2).add(new Paragraph("ƏMƏK MÜQAVİLƏSİ BİLDİRİŞİ:").setFont(pdfFont)).setTextAlignment(TextAlignment.CENTER).setFontSize(14).setBold().setBorder(Border.NO_BORDER)).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1));
        table0.addCell(new Cell(0, 2).add(new Paragraph("").setHeight(10).setFontSize(10).setPaddingLeft(4).setFontColor(new DeviceRgb(53, 165, 214)).setFont(pdfFont)).setTextAlignment(TextAlignment.CENTER).setFontSize(13).setBold().setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));


        float col1 = 280f;
        float columnWidt[] = {col1, col1};
        Table table = new Table(columnWidt).setFont(pdfFont).setFontSize(8);
        table.addCell(new Cell().add(new Paragraph("No: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setPaddingLeft(4).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table.addCell(new Cell().add(new Paragraph("Sistemə daxil edilmə tarixi: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setPaddingLeft(90).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));

//        PDFont font = PDTrueTypeFont.loadTTF(document, new File("Arial.ttf"));
        float col = 280f;
        float columnWidt1[] = {col, col};
        Table table1 = new Table(columnWidt1).setFont(pdfFont);

        table1.setBackgroundColor(new DeviceRgb(53, 165, 214)).setFontColor(new DeviceRgb(255, 255, 255));
        table1.addCell(new Cell(0, 2).add(new Paragraph("FİZİKİ ŞƏXS OLAN İŞƏGÖTÜRƏN BARƏDƏ MƏLUMATLAR").setFontSize(9).setFont(pdfFont)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));


        float columnWid2[] = {190, 190, 190};
        Table table2 = new Table(columnWid2).setFontSize(8).setFont(pdfFont);
        table2.addCell(new Cell().add(new Paragraph("Soyadı: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setPaddingLeft(4).setBorder(Border.NO_BORDER).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table2.addCell(new Cell().add(new Paragraph("Adı: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        table2.addCell(new Cell().add(new Paragraph("Atasının adı: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setPaddingLeft(5).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table2.addCell(new Cell(0,1).add(new Paragraph("SUN: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setPaddingLeft(4).setBorder(Border.NO_BORDER).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table2.addCell(new Cell(0,2).add(new Paragraph("VÖEN: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table2.addCell(new Cell(0,3).add(new Paragraph("Qeydiyyatda olduğu ünvan: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setPaddingLeft(4).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table2.addCell(new Cell(0,3).add(new Paragraph("Əlaqə telefonları: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setPaddingLeft(4).setBorder(Border.NO_BORDER).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table2.addCell(new Cell(0,1).add(new Paragraph("SSN: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setPaddingLeft(4).setBorder(Border.NO_BORDER).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table2.addCell(new Cell(0,2).add(new Paragraph("FİN: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));

        table2.addCell(new Cell(0,3).add(new Paragraph("Şəxsiyyətini təsdiq edən sənədin")).setPaddingLeft(4).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));

        table2.addCell(new Cell(0, 2).add(new Paragraph("adı: ").add(new Text("passport").setFont(pdfFont).setItalic().setBold())).setPaddingLeft(30).setBorder(Border.NO_BORDER)).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1));
        table2.addCell(new Cell(0,1).add(new Paragraph("seriyası və nömrəsi: ").add(new Text("serialNumber").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));

        table2.addCell(new Cell(0, 2).add(new Paragraph("verildiyi tarix: ").add(new Text("issueDate").setFont(pdfFont).setItalic().setBold())).setPaddingLeft(30).setBorder(Border.NO_BORDER)).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1));
        table.addCell(new Cell(0,1).add(new Paragraph("sənədi verən orqanın adı: ").add(new Text("fin").setFont(pdfFont).setItalic().setBold())).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));


        float columnWidt3[] = {190, 190, 190};
        Table table3 = new Table(columnWidt3).setFont(pdfFont);

        table3.setBackgroundColor(new DeviceRgb(53, 165, 214)).setFontColor(new DeviceRgb(255, 255, 255));
        table3.addCell(new Cell(0, 3).add(new Paragraph("İŞƏGÖTÜRƏNİN SƏLAHİYYƏTLƏRİNİ YERİNƏ YETİRƏN ŞƏXS BARƏDƏ MƏLUMATLAR").setFontSize(9)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));

        float columnWidt4[] = {190, 190, 190};
        Table table4 = new Table(columnWidt4).setFont(pdfFont).setFontSize(8);
        table4.addCell(new Cell(0,3).add(new Paragraph("Vəzifəsi")).setPaddingLeft(4).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));

        table4.addCell(new Cell().add(new Paragraph(" Soyadı :").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setPaddingLeft(4).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table4.addCell(new Cell().add(new Paragraph("Adı: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER)).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setFontSize(8);
        table4.addCell(new Cell().add(new Paragraph("Atasının adı: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));

        table4.addCell(new Cell(0,3).add(new Paragraph(" FİN :" ).add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setPaddingLeft(4).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));

        table4.addCell(new Cell(0,3).add(new Paragraph("Şəxsiyyətini təsdiq edən sənədin")).setPaddingLeft(4).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));

        table4.addCell(new Cell().add(new Paragraph("adı: ").add(new Text("Dolacaq yer").setFont(pdfFont).setItalic().setBold())).setPaddingLeft(50).setBorder(Border.NO_BORDER));
        table4.addCell(new Cell(0,2).add(new Paragraph("seriyası və nömrəsi: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setPaddingLeft(50).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));

        table4.addCell(new Cell().add(new Paragraph("verildiyi tarix: ").add(new Text("Dolacaq yer").setFont(pdfFont).setItalic().setBold())).setPaddingLeft(50).setBorder(Border.NO_BORDER));
        table4.addCell(new Cell(0,2).add(new Paragraph("sənədi verən orqanın adı: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setPaddingLeft(50).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));


        float columnWidt5[] = {190, 190, 190};
        Table table5 = new Table(columnWidt5).setFont(pdfFont).setFontSize(8);

        table5.setBackgroundColor(new DeviceRgb(53, 165, 214)).setFontColor(new DeviceRgb(255, 255, 255));
        table5.addCell(new Cell(0, 3).add(new Paragraph("İŞÇİ BARƏDƏ MƏLUMAT").setFontSize(9)).setPaddingLeft(4).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));

        String imegePath = "facebook-share.jpg";
        ImageData imageData = ImageDataFactory.create(imegePath);
        Image image = new Image(imageData);
        image.setMaxWidth(70f);
        image.setHeight(120f);

        float columnWid6[] = {130, 140, 140, 140};
        Table table6 = new Table(columnWid6).setFont(pdfFont).setFontSize(7);
        table6.addCell(new Cell(11, 0).add(image).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table6.addCell(new Cell().add(new Paragraph(" Soyadı: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        table6.addCell(new Cell().add(new Paragraph("Adı: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER)).setFontSize(8);
        table6.addCell(new Cell().add(new Paragraph("Ata adı: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));

        table6.addCell(new Cell().add(new Paragraph(" Cinsi :" ).add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        table6.addCell(new Cell(0,2).add(new Paragraph("Vətəndaşlığı: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));


        table6.addCell(new Cell(0,3).add(new Paragraph("Şəxsiyyətini təsdiq edən sənədin")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table6.addCell(new Cell().add(new Paragraph("adı: " ).add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setPaddingLeft(15).setBorder(Border.NO_BORDER));
        table6.addCell(new Cell(0, 2).add(new Paragraph("seriyası və nömrəsi: ").setPaddingLeft(20).add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table6.addCell(new Cell().add(new Paragraph("verildiyi tarix: " ).add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setPaddingLeft(15).setBorder(Border.NO_BORDER));
        table6.addCell(new Cell(0, 2).add(new Paragraph("sənədi verən orqanın adı: ").setPaddingLeft(20).add(new Text(" BAKI ŞƏHƏR YASAMAL RPİ QVŞV ŞÖBƏSİ").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table6.addCell(new Cell(0, 1).add(new Paragraph("FİN: ").add(new Text("Dolacq yer").setFont(pdfFont).setItalic().setBold())).setPaddingLeft(15).setBorder(Border.NO_BORDER));
        table6.addCell(new Cell(0,2).add(new Paragraph("SSN: ").add(new Text("Dolacaq yer").setFont(pdfFont).setItalic().setBold())).setPaddingLeft(20).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table6.addCell(new Cell(0,1).add(new Paragraph("Doğum tarixi: ").add(new Text("Dolacaq yer").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        table6.addCell(new Cell(0, 2).add(new Paragraph("Əlaqə telefonları: ").add(new Text("Dolcaaq yer").setFont(pdfFont).setItalic().setBold())).setPaddingLeft(20).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));

        table6.addCell(new Cell(0, 3).add(new Paragraph("Qeydiyyatda olduğu ünvan: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table6.addCell(new Cell(0, 3).add(new Paragraph("Yaşadığı ünvan: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));


        float columnWidt7[] = {190, 190, 190};
        Table table7 = new Table(columnWidt7).setFont(pdfFont).setFontSize(8);

        table7.setBackgroundColor(new DeviceRgb(53, 165, 214)).setFontColor(new DeviceRgb(255, 255, 255));
        table7.addCell(new Cell(0, 3).add(new Paragraph("İŞ YERİ BARƏDƏ MƏLUMATLAR").setFontSize(9)).setPaddingLeft(4).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));


        float columnWidt8[] = {280f, 280f};
        Table table8 = new Table(columnWidt8).setFont(pdfFont).setFontSize(8);
        table8.addCell(new Cell(0, 2).add(new Paragraph("İşyerinin adı: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setPaddingLeft(4).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table8.addCell(new Cell(0, 2).add(new Paragraph("İş yerinin əsas və ya əlavə olması barədə qeyd: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setPaddingLeft(4).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table8.addCell(new Cell(0, 2).add(new Paragraph("İşçinin vəzifəsinin (peşəsinin) adı: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setPaddingLeft(4).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));

        float columnWidt9[] = {190, 190, 190};
        Table table9 = new Table(columnWidt9).setFont(pdfFont).setFontSize(8);

        table9.setBackgroundColor(new DeviceRgb(53, 165, 214)).setFontColor(new DeviceRgb(255, 255, 255));
        table9.addCell(new Cell(0, 3).add(new Paragraph("DİGƏR MƏLUMATLAR").setFontSize(9)).setPaddingLeft(4).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));


        float columnWidt10[] = {280f, 280f};
        Table table10 = new Table(columnWidt10).setFont(pdfFont).setFontSize(8);
        table10.addCell(new Cell(0, 2).add(new Paragraph("Əmək müqaviləsinin bağlandığı tarix: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setPaddingLeft(4).setBorder(Border.NO_BORDER).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table10.addCell(new Cell(0, 2).add(new Paragraph("Əmək müqaviləsinin növü: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setPaddingLeft(4).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table10.addCell(new Cell(0, 2).add(new Paragraph("Müddətli əmək müqaviləsinin müddətinin qurtardığı tarix: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setPaddingLeft(4).setBorder(Border.NO_BORDER).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table10.addCell(new Cell(0, 2).add(new Paragraph("Əməyin ödənilməsinin formasının işəmuzd və ya vaxtamuzd olması barədə qeyd: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setPaddingLeft(4).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table10.addCell(new Cell(0, 2).add(new Paragraph("İşçinin aylıq əmək haqqının məbləği, manatla: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setPaddingLeft(4).setBorder(Border.NO_BORDER).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));

        float columnWidt11[] = {190, 190, 190};
        Table table11 = new Table(columnWidt11).setFont(pdfFont).setFontSize(8);

        table11.addCell(new Cell().add(new Paragraph("Çap edildiyi an statusu: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold()).setFontSize(8f)).setTextAlignment(TextAlignment.CENTER).setPaddingLeft(4).setBorder(Border.NO_BORDER).setBorderTop(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table11.addCell(new Cell().add(new Paragraph("Bildirişin imzalandığı tarix: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold()).setFontSize(8f)).setTextAlignment(TextAlignment.CENTER).setPaddingLeft(4).setBorder(Border.NO_BORDER).setBorderTop(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table11.addCell(new Cell().add(new Paragraph("Çap tarixi: ").add(new Text("Uid").setFont(pdfFont).setItalic().setBold()).setFontSize(8f)).setTextAlignment(TextAlignment.CENTER).setBorder(Border.NO_BORDER).setPaddingLeft(4).setBorderTop(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));

        float columnWidt12[] = {140, 140, 140, 140};
        Table table12 = new Table(columnWidt12).setFont(pdfFont).setFontSize(8);
        table12.addCell(new Cell(0, 2).add(new Paragraph("Sistemə daxil edən şəxs: ").add(new Text("Dolacaq yer").setFont(pdfFont).setItalic().setBold()).setFontSize(8f)).setTextAlignment(TextAlignment.CENTER).setPaddingLeft(4).setBorder(Border.NO_BORDER).setBorderTop(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderLeft(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderBottom(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table12.addCell(new Cell(0, 2).add(new Paragraph("İmzalayan şəxs: ").add(new Text("Dolacaq yer").setFont(pdfFont).setItalic().setBold()).setFontSize(8f)).setTextAlignment(TextAlignment.CENTER).setPaddingLeft(4).setBorder(Border.NO_BORDER).setBorderTop(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderBottom(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)).setBorderRight(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));

        document.add(table0);
        document.add(table);
        document.add(table1);
        document.add(table2);
        document.add(table3);
        document.add(table4);
        document.add(table5);
        document.add(table6);
        document.add(table7);
        document.add(table8);
        document.add(table9);
        document.add(table10);
        document.add(table11);
        document.add(table12);
        document.close();

    }

}
