package com.example.demo.Bean;

import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.colors.WebColors;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.*;
import org.apache.catalina.Server;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//import sandbox.WrapToTest;
class BarcodeInTable {
    public static final String DEST = "C:\\Users\\nando\\Desktop\\simple2.pdf";
//    public static  final String azeri="arial.ttf";


    public static void main(String[] args) throws IOException, DocumentException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new BarcodeInTable().createPdf(DEST);

    }
    public void createPdf(String dest) throws IOException, DocumentException {
        Document document = new Document();

         final String azeri="arial.ttf";

//Vacibdi




        BaseFont font = BaseFont.createFont("arial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

        BaseColor color = new BaseColor(53,165,214);

        String code = "675-FH-A12";
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(dest));
        document.open();
        PdfContentByte cb = writer.getDirectContent();

        Barcode128 code128 = new Barcode128();
        code128.setBaseline(-1);
        code128.setSize(12);
        code128.setCode(code);
        code128.setCodeType(Barcode128.CODE128);
        Image code128Image = code128.createImageWithBarcode(cb, null, null);


        code128 = new Barcode128();
        code128.setFont(null);
        code128.setCode(code);
        code128.setCodeType(Barcode128.CODE128);
        code128Image = code128.createImageWithBarcode(cb, null, null);
        PdfPCell cell = new PdfPCell(code128Image);






        PdfPTable table = new PdfPTable(1);
        PdfPCell cell2 = new PdfPCell();
       Phrase p = new Phrase("AZƏRBAYCAN RESPUBLİKASI ƏMƏK VƏ ƏHALİNİN SOSİAL MÜDAFİƏSİ NAZİRLİYİNİN");
       p.setFont(new Font(font, 10, Font.BOLD, color));
       cell2.addElement(p);
       cell2.setBorderColor(BaseColor.WHITE);
        PdfPCell cell3 = new PdfPCell();
        Phrase p2 = new Phrase("Mərkəzləşdirilmiş Elektron İnformasiya Sistemi");
        p2.setFont(new Font(font, 11, Font.BOLD, color));
        cell3.addElement(p2);
        cell3.setBorderColor(BaseColor.WHITE);
        cell3.setPaddingLeft(80);

        PdfPCell cell4 = new PdfPCell();
        Phrase p3 = new Phrase("İş yerinə dair arayış");
        p3.setFont(new Font(font, 11, Font.BOLD, color));
        cell4.addElement(p3);
        cell4.setBorderColor(BaseColor.WHITE);
        cell4.setPaddingLeft(150);

        table.addCell(cell2);
        table.addCell(cell3);
        table.addCell(cell4);

        PdfPTable table2 = new PdfPTable(2);


        PdfPCell cell5 = new PdfPCell();
        Phrase p5 = new Phrase("No:");
        p5.setFont(new Font(font, 9, Font.NORMAL));
        cell5.addElement(p5);
        cell5.setBorderColor(BaseColor.WHITE);

        PdfPCell cell6 = new PdfPCell();
        Phrase p6 = new Phrase("Tarix:");
        p6.setFont(new Font(font, 9, Font.NORMAL));
        cell6.addElement(p6);
        cell6.setBorderColor(BaseColor.WHITE);
        cell6.setPaddingLeft(100);

        table2.addCell(cell5);
        table2.addCell(cell6);


        PdfPTable table3 = new PdfPTable(1);

        PdfPCell cell7 = new PdfPCell();
        Phrase p7 = new Phrase("İşəgötürən barədə məlumatlar");
        p7.setFont(new Font(font, 10, Font.NORMAL,BaseColor.WHITE));
        cell7.addElement(p7);
        cell7.setBackgroundColor(color);
        cell7.setBorderColor(BaseColor.WHITE);
        cell7.setPaddingBottom(10);
        cell7.setPaddingLeft(10);
        table3.addCell(cell7);


        PdfPCell cell8 = new PdfPCell();
        Phrase p8 = new Phrase("İşəgötürənin tam adı:");
        p8.setFont(new Font(font, 8, Font.NORMAL));
        cell8.addElement(p8);
        cell8.setBorderColor(BaseColor.WHITE);

        PdfPCell cell9 = new PdfPCell();
        Phrase p9 = new Phrase("Əlaqə telefonları: " +" Dolacaq yer");
        p9.setFont(new Font(font, 8, Font.NORMAL));
        cell9.addElement(p9);
        cell9.setBorderColor(BaseColor.WHITE);
        table3.addCell(cell8);
        table3.addCell(cell9);


        PdfPTable table4 = new PdfPTable(1);

        PdfPCell cell10 = new PdfPCell();
        Phrase p10 = new Phrase("İşçi barədə məlumatlar");
        p10.setFont(new Font(font, 10, Font.NORMAL,BaseColor.WHITE));
        cell10.addElement(p10);
        cell10.setBackgroundColor(color);
        cell10.setBorderColor(BaseColor.WHITE);
        cell10.setPaddingBottom(10);
        cell10.setPaddingLeft(10);
        table4.addCell(cell10);

        PdfPTable table5 = new PdfPTable(4);

//        Image image = Image.getInstance("icon.png");
//        PdfPCell cell11 = new PdfPCell(image, true);
//        cell11.setFixedHeight(100);
//        table5.addCell(cell11);

//        table5.addCell(new PdfPCell(image, true));
//        Phrase p11 = new Phrase("Əlaqə telefonları: " +" Dolacaq yer");
//        p11.setFont(new Font(font, 8, Font.NORMAL));
//
//        cell11.addElement(p11);
//        cell11.setBorderColor(BaseColor.WHITE);


//        Image image2 = Image.getInstance("icon.png");
//        PdfPCell cell011 = new PdfPCell(image2, true);
//        cell11.setFixedHeight(100);
//        table5.addCell(cell011);

//
//        PdfPCell cel012 = new PdfPCell();
//        Phrase p012 = new Phrase(" ");
//        p012.setFont(new Font(font, 8, Font.NORMAL));
//        cel012.addElement(p012);
//        cel012.setBorderColor(BaseColor.WHITE);
//        cel012.setPaddingLeft(10);
//        table5.addCell(cel012);

        Image image2 = Image.getInstance("icon.png");

        PdfPCell cell013 = new PdfPCell(image2, true);

        cell013.setFixedHeight(100);
        cell013.setColspan(1);
        cell013.setRowspan(8);
        table5.addCell(cell013);

        PdfPCell cel12 = new PdfPCell();
        Phrase p12 = new Phrase("Soyadı: " +" Dolacaq yer");
        p12.setFont(new Font(font, 8, Font.NORMAL));
        cel12.addElement(p12);
        cel12.setBorderColor(BaseColor.WHITE);
        cel12.setPaddingLeft(10);
        table5.addCell(cel12);

        PdfPCell cel13 = new PdfPCell();
        Phrase p13 = new Phrase("adı: " +" Dolacaq yer");
        p13.setFont(new Font(font, 8, Font.NORMAL));
        cel13.addElement(p13);
        cel13.setBorderColor(BaseColor.WHITE);
        table5.addCell(cel13);

        PdfPCell cel14 = new PdfPCell();
        Phrase p14 = new Phrase("Ata adı: " +" Dolacaq yer");
        p14.setFont(new Font(font, 8, Font.NORMAL));
        cel14.addElement(p13);
        cel14.setBorderColor(BaseColor.WHITE);
        table5.addCell(cel14);






        PdfPCell cel15 = new PdfPCell();
        Phrase p15 = new Phrase("Şəxsiyyətini təsdiq edən sənədin: " +" Dolacaq yer");
        p15.setFont(new Font(font, 8, Font.NORMAL));
        cel15.addElement(p15);
        cel15.setBorderColor(BaseColor.WHITE);
        cel15.setPaddingLeft(10);
        cel15.setColspan(3);
        table5.addCell(cel15);

        PdfPCell cel16 = new PdfPCell();
        Phrase p16 = new Phrase("addde: " +" Dolacaq yer");
        p16.setFont(new Font(font, 8, Font.NORMAL));
        cel16.addElement(p16);
        cel16.setBorderColor(BaseColor.WHITE);
        cel16.setPaddingLeft(10);
        cel16.setColspan(1);
        table5.addCell(cel16);

        PdfPCell cel17 = new PdfPCell();
        Phrase p17 = new Phrase("seriyası və nömrəsi: " +" Dolacaq yer");
        p17.setFont(new Font(font, 8, Font.NORMAL));
        cel17.addElement(p17);
        cel17.setBorderColor(BaseColor.WHITE);
        cel17.setPaddingLeft(10);
        cel17.setColspan(2);
        table5.addCell(cel17);

        PdfPCell cel18 = new PdfPCell();
        Phrase p18 = new Phrase("verildiyi tarix: " +" Dolacaq yer");
        p18.setFont(new Font(font, 8, Font.NORMAL));
        cel18.addElement(p18);
        cel18.setBorderColor(BaseColor.WHITE);
        cel18.setPaddingLeft(10);
        cel18.setColspan(2);
        table5.addCell(cel18);

        PdfPCell cel19 = new PdfPCell();
        Phrase p19 = new Phrase("FIN: " +" Dolacaq yer");
        p19.setFont(new Font(font, 8, Font.NORMAL));
        cel19.addElement(p19);
        cel19.setBorderColor(BaseColor.WHITE);
        cel19.setPaddingLeft(10);
        cel19.setColspan(1);
        table5.addCell(cel19);

        PdfPCell cel20 = new PdfPCell();
        Phrase p20 = new Phrase("Doğum tarixi: " +" Dolacaq yer");
        p20.setFont(new Font(font, 8, Font.NORMAL));
        cel20.addElement(p20);
        cel20.setBorderColor(BaseColor.WHITE);
        cel20.setPaddingLeft(10);
        cel20.setColspan(3);
        table5.addCell(cel20);

        PdfPCell cel21 = new PdfPCell();
        Phrase p21 = new Phrase("Qeydiyyatda olduğu ünvan: " +" Dolacaq yer");
        p21.setFont(new Font(font, 8, Font.NORMAL));
        cel21.addElement(p21);
        cel21.setBorderColor(BaseColor.WHITE);
        cel21.setPaddingLeft(10);
        cel21.setColspan(3);
        table5.addCell(cel21);

        PdfPCell cel22 = new PdfPCell();
        Phrase p22 = new Phrase("Əlaqə telefonları " +" Dolacaq yer");
        p22.setFont(new Font(font, 8, Font.NORMAL));
        cel22.addElement(p22);
        cel22.setBorderColor(BaseColor.WHITE);
        cel22.setPaddingLeft(10);
        cel22.setColspan(1);
        table5.addCell(cel22);

        PdfPCell cel23 = new PdfPCell();
        Phrase p23 = new Phrase("Qeydiyyatda olduğu ünvan: " +" Dolacaq yer");
        p23.setFont(new Font(font, 8, Font.NORMAL));
        cel23.addElement(p23);
        cel23.setBorderColor(BaseColor.WHITE);
        cel23.setPaddingLeft(10);
        cel23.setColspan(2);
        table5.addCell(cel23);


//        PdfPCell cel16 = new PdfPCell();
//        Phrase p16 = new Phrase("");
//        p16.setFont(new Font(font, 8, Font.NORMAL));
//        cel16.addElement(p16);
//        cel16.setBorderColor(BaseColor.WHITE);
//        table5.addCell(cel16);
//
//        PdfPCell cel17 = new PdfPCell();
//        Phrase p17 = new Phrase("");
//        p17.setFont(new Font(font, 8, Font.NORMAL));
//        cel17.addElement(p17);
//        cel17.setBorderColor(BaseColor.WHITE);
//        table5.addCell(cel17);








        document.add(table);
        document.add(table2);
        document.add(table3);
        document.add(table4);
        document.add(table5);



        document.close();
    }

}


//
//
//     Rectangle rect = new Rectangle(36, 36, 559, 806);
//     rect.setBorder(Rectangle.BOX);
//     rect.setBorderWidth(2);
//     rect.setBorderColor(BaseColor.BLUE);
//
//        String path="C:\\Users\\nando\\Desktop\\simple.pdf";
//        PdfWriter pdfwriter=new PdfWriter(path);
//
//
//        PdfDocument pdfDocument=new PdfDocument(pdfwriter);
//
//        pdfDocument.setDefaultPageSize(PageSize.A4);
//       Document document =new Document(pdfDocument);
//
//
//        com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
//        com.itextpdf.text.pdf. PdfWriter writer = com.itextpdf.text.pdf.PdfWriter.getInstance(doc, new FileOutputStream(path));
//        doc.open();
//        PdfContentByte cb = writer.getDirectContent();
//
//        Paragraph paragraph=new Paragraph();
//        Style style=new Style();
//        style.setFontSize(14f).setMarginLeft(150f).setBold().setMarginBottom(20f);
//       PdfFont pdfFont=PdfFontFactory.createFont(azeri);
//
//     float columnWidt0[]={280f,280f};
//     Table table0=new Table(columnWidt0).setMarginBottom(10).setFont(pdfFont);
//        table0.addCell(new Cell(0,2).add(new Paragraph("AZƏRBAYCAN RESPUBLİKASI ƏMƏK VƏ ƏHALİNİN SOSİAL MÜDAFİƏSİ NAZİRLİYİNİN").setFontColor(new DeviceRgb(53,165,214)).setFont(pdfFont)).setTextAlignment(TextAlignment.LEFT).setFontSize(12).setBold().setBorder(Border.NO_BORDER));
//        table0.addCell(new Cell(0,2).add(new Paragraph("Mərkəzləşdirilmiş Elektron İnformasiya Sistemi").setTextAlignment(TextAlignment.CENTER).setFontColor(new DeviceRgb(53,165,214)).setFont(pdfFont)).setTextAlignment(TextAlignment.LEFT).setFontSize(12).setBold().setBorder(Border.NO_BORDER));
//        table0.addCell(new Cell(0,2).add(new Paragraph("İş yerinə dair arayış").setFontColor(new DeviceRgb(53,165,214)).setFont(pdfFont)).setTextAlignment(TextAlignment.CENTER).setFontSize(12).setBold().setBorder(Border.NO_BORDER));
//
//        float col1=280f;
//        float columnWidt[]={col1,col1};
//        Table table=new Table(columnWidt).setFont(pdfFont);
//        table.addCell(new Cell().add(new Paragraph("No:").setFont(pdfFont)).setTextAlignment(TextAlignment.LEFT).setFontSize(9).setBorder(Border.NO_BORDER));
//        table.addCell(new Cell().add(new Paragraph("Tarix:").setFont(pdfFont)).setTextAlignment(TextAlignment.RIGHT).setPaddingRight(80f).setFontSize(9).setBorder(Border.NO_BORDER));
//
////        PDFont font = PDTrueTypeFont.loadTTF(document, new File("Arial.ttf"));
//        float col=280f;
//        float columnWidt1[]={col,col};
//        Table table1=new Table(columnWidt1).setFont(pdfFont);
//
//        table1.setBackgroundColor(new DeviceRgb(53,165,214)).setFontColor(new DeviceRgb(255,255,255));
//        table1.addCell(new Cell(0,2).add(new Paragraph("İşəgötürən barədə məlumatlar").setFontSize(11).setFont(pdfFont)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//
//
//       float columnWid2[]={190,190,190};
//       Table table2=new Table(columnWid2).setFontSize(9).setFont(pdfFont).setWordSpacing(0);
//        table2.addCell(new Cell(0,3).add(new Paragraph("İşəgötürənin tam adı: :"+"Dolacaq yer")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//        table2.addCell(new Cell(0,3).add(new Paragraph("Əlaqə telefonları: : "+"Dolacaq yer" )).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//
//        float columnWidt5[]={190,190,190};
//        Table table5=new Table(columnWidt5).setFont(pdfFont);
//
//        table5.setBackgroundColor(new DeviceRgb(53,165,214)).setFontColor(new DeviceRgb(255,255,255));
//        table5.addCell(new Cell(0,3).add(new Paragraph("İŞÇİ BARƏDƏ MƏLUMAT").setFontSize(11)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//
//        String imegePath="facebook-share.jpg";
//        ImageData imageData=ImageDataFactory.create(imegePath);
//        Image image=new Image(imageData);
//        image.setMaxWidth(70f);
//        image.setHeight(105f);
//
//        float columnWid6[]={130,140,140,140};
//        Table table6=new Table(columnWid6).setFont(pdfFont);
//        table6.addCell(new Cell(7,0).add(image).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//        table6.addCell(new Cell().add(new Paragraph(" Soyadı :"+"Dolacaq yer")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//        table6.addCell(new Cell().add(new Paragraph("Adı: "+"Dolacaq yer")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER)).setMarginBottom(0).setFontSize(8);
//        table6.addCell(new Cell().add(new Paragraph("Ata adı: "+"Dolacaq yer")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//
//     table6.addCell(new Cell().add(new Paragraph("Şəxsiyyətini təsdiq edən sənədin")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//        table6.addCell(new Cell(0,2).add(new Paragraph("")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//
//        table6.addCell(new Cell(0,2).add(new Paragraph("adı: "+"Dolacaq yer")).setBorder(Border.NO_BORDER));
//        table6.addCell(new Cell().add(new Paragraph("seriyası və nömrəsi: "+"Dolacaq yer")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
////        table6.addCell(new Cell(0,1).add(new Paragraph("")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//
//        table6.addCell(new Cell(0,2).add(new Paragraph("verildiyi tarix: "+"Dolacaq yer")).setPaddingLeft(15).setBorder(Border.NO_BORDER));
//        table6.addCell(new Cell().add(new Paragraph("FİN: "+"Dolacaq yer")).setBorder(Border.NO_BORDER));
////        table6.addCell(new Cell(0,1).add(new Paragraph("")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//
//        table6.addCell(new Cell().add(new Paragraph("Doğum tarixi: "+"Dolacaq yer")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//        table6.addCell(new Cell(0,3).add(new Paragraph("")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//
//        table6.addCell(new Cell(0,3).add(new Paragraph("Qeydiyyatda olduğu ünvan: "+"Dolacaq yer")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//
//        table6.addCell(new Cell(0,2).add(new Paragraph("Əlaqə telefonları:  "+"Dolacaq yer")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//        table6.addCell(new Cell().add(new Paragraph("Email:  "+"Dolacaq yer")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//
//        //        table6.addCell(new Cell(0,1).add(new Paragraph("")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//
//        float columnWidt7[]={190,190,190};
//        Table table7=new Table(columnWidt7).setFont(pdfFont);
//
//        table7.setBackgroundColor(new DeviceRgb(53,165,214)).setFontColor(new DeviceRgb(255,255,255));
//        table7.addCell(new Cell(0,3).add(new Paragraph("İş yeri barədə məlumatlar").setFontSize(11)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//
//String str=("İnformasiya Texnologiyaları departamenti-> ");
//        String str2=("Məşğulluq təsnifatı üzrə: ");
//        float columnWidt8[]={280f,280f};
//        Table table8=new Table(columnWidt8).setFont(pdfFont);
//        table8.addCell(new Cell(0,2).add(new Paragraph("İşyerinin adı: "+(str)+"Dolacaq yer").setFontSize(9f)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//        table8.addCell(new Cell(0,2).add(new Paragraph("İşçinin vəzifəsinin (peşəsinin) adı: "+(str2)+"Dolacaq yer").setFontSize(9f)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//
//        float columnWidt9[]={190,190,190};
//        Table table9=new Table(columnWidt9).setFont(pdfFont);
//
//        table9.setBackgroundColor(new DeviceRgb(53,165,214)).setFontColor(new DeviceRgb(255,255,255));
//        table9.addCell(new Cell(0,3).add(new Paragraph("Digər məlumatlar").setFontSize(11)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//
//        float columnWidt10[]={280f,280f};
//        Table table10=new Table(columnWidt10).setFont(pdfFont);
//        table10.addCell(new Cell(0,2).add(new Paragraph("Əmək müqaviləsinin bağlandığı tarix: "+"Dolacaq yer")).setTextAlignment(TextAlignment.LEFT).setFontSize(9f).setBorder(Border.NO_BORDER));
//        table10.addCell(new Cell(0,2).add(new Paragraph("Müddətli əmək müqaviləsinin müddətinin qurtardığı tarix: "+"Dolacaq yer")).setFontSize(9f).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//
//
//        float columnWidt11[]={190,190,190};
//        Table table11=new Table(columnWidt11).setFont(pdfFont);
//
//        table11.setBackgroundColor(new DeviceRgb(53,165,214)).setFontColor(new DeviceRgb(255,255,255));
//        table11.addCell(new Cell(0,3).add(new Paragraph("Arayışın təyinatı").setFontSize(11)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//
//
//        float columnWidt12[]={280f,280f};
//        Table table12=new Table(columnWidt12).setFont(pdfFont);
//        table12.addCell(new Cell(0,2).add(new Paragraph("Təyinatı: "+"Dolacaq yer").setFontSize(9f)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//
//
//        float columnWidt13[]={190,190,190};
//        Table table13=new Table(columnWidt13).setFont(pdfFont);
//
//        table13.setBackgroundColor(new DeviceRgb(53,165,214)).setFontColor(new DeviceRgb(255,255,255));
//        table13.addCell(new Cell(0,3).add(new Paragraph("Əlavə məlumatlar: ").setFontSize(11)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//
//
//        Barcode128 barcode128 = new Barcode128();
//        barcode128.setCode("memorynotfound.com");
//        barcode128.setCodeType(Barcode.CODE128);
//
//        com.itextpdf.text.Image code128Image = barcode128.createImageWithBarcode(cb, null, null);
//
////        BarcodeQRCode barcodeQRCode = new BarcodeQRCode("https://memorynotfound.com", 1000, 1000, null);
////        Image codeQrImage = barcodeQRCode.getImage();
////        codeQrImage.scaleAbsolute(100, 100);
////        document.add(codeQrImage);
//
//
//
//        float columnWidt14[]={280f,280f};
//        Table table14=new Table(columnWidt14).setFont(pdfFont);
//        table14.addCell(new Cell(0,2).add(new Paragraph("Arayış "+"Dolacaq yer"+" əmək müqaviləsi bildirişi üzrə hazırlanmışdır").setFontSize(9f)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//        table14.addCell(new Cell(0,2).add(new Paragraph("Arayışın etibarlılıq müddəti: "+"Dolacaq yer").setFontSize(9f)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
//        table14.addCell(new Cell(0,2).add(new Paragraph("Arayışın etibarlılıq müddəti: "+"Dolacaq yer").setFontSize(9f)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderBottom(new DoubleBorder(new DeviceRgb(53,165,214),1)));
////       table14.addCell(new Cell(0,2).add(new Paragraph(code128Image)).setFontSize(9f)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderBottom(new DoubleBorder(new DeviceRgb(53,165,214),1));
//
////        doc.add(code128Image);
////        doc.newPage();
//
//
////        float columnWidt11[]={190,190,190};
////        Table table11=new Table(columnWidt11).setFont(pdfFont);
////
////        table11.addCell(new Cell().add(new Paragraph("Çap edildiyi an statusu: "+"Dolacaq yer").setFontSize(9f)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderTop(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)));
////        table11.addCell(new Cell().add(new Paragraph("Bildirişin imzalandığı tarix: "+"Dolacaq yer").setFontSize(9f)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderTop(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)));
////        table11.addCell(new Cell().add(new Paragraph("Çap tarix: "+"Dolacaq yer").setFontSize(9f)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderTop(new DoubleBorder(new DeviceRgb(53,165,214),1)));
//////.setBorderBottom(new DoubleBorder(new DeviceRgb(53,165,214),1))
////
////        float columnWidt12[]={140,140,140,140};
////        Table table12=new Table(columnWidt12).setFont(pdfFont);
////        table12.addCell(new Cell(0,2).add(new Paragraph("Sistemə daxil edən şəxs: "+"Dolacaq yer").setFontSize(9f)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderTop(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderBottom(new DoubleBorder(new DeviceRgb(53,165,214),1)).setPaddingLeft(50f));
////        table12.addCell(new Cell(0,2).add(new Paragraph("İmzalayan şəxs: "+"Dolacaq yer").setFontSize(9f)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderTop(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderBottom(new DoubleBorder(new DeviceRgb(53,165,214),1)).setPaddingLeft(50f));
//
//
//        document.add(table0);
//        document.add(table);
//        document.add(table1);
//        document.add(table2);
//        document.add(table5);
//        document.add(table6);
//        document.add(table7);
//        document.add(table8);
//        document.add(table9);
//        document.add(table10);
//        document.add(table11);
//        document.add(table12);
//        document.add(table13);
//        document.add(table14);
//        document.close();




//        PDPage page = new PDPage(rec);
//        document.addPage(page);
//        PDPageContentStream contentStream = new PDPageContentStream
//        (document, page, PDPageContentStream.AppendMode.APPEND, true);
//        contentStream.beginText();
//
//      contentStream.setFont(PDType1Font.HELVETICA_OBLIQUE, 15);
//        contentStream.newLineAtOffset(200, 800);
//        contentStream.showText("əmək müqaviləsi");
//        contentStream.endText();
//        contentStream.close();

//.setFontSize(12f).setMarginLeft(10f)
//        Paragraph paragraph2=new Paragraph();
//        Text text2 =new Text("No:").setTextAlignment(TextAlignment.LEFT);
//        paragraph2.add(text2);
//        Text text3 =new Text("Sisteme daxil edilme tarixi:");
//        text3.setTextAlignment(TextAlignment.RIGHT);
//        paragraph2.add(text3);


//        PdfPCell cell2 = new PdfPCell();
//        cell2.setBackgroundColor(color);
//        Phrase p = new Phrase("Müqaviləə");
//        p.setFont(new Font(font, 11, Font.NORMAL, BaseColor.WHITE));
//        cell2.addElement(p);
//        cell2.setBackgroundColor(color);