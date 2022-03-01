package com.example.demo.Bean;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Writer;
import com.google.zxing.qrcode.QRCodeWriter;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.borders.DoubleBorder;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.VerticalAlignment;

import java.io.*;;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PDFBarcode {
    public static final String azeri = "arial.ttf";

    public static void main(String[] args) throws IOException, WriterException {

        String path = "C:\\Users\\nando\\Desktop\\Elnur.pdf";
        Path path2 = Paths.get("arial.ttf");

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PdfWriter pdfwriter = new PdfWriter(path);

        PdfDocument pdfDocument = new PdfDocument(pdfwriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document = new Document(pdfDocument);
        Style style = new Style();
        style.setFontSize(14f).setMarginLeft(150f).setBold().setMarginBottom(20f);
        PdfFont pdfFont = PdfFontFactory.createFont(azeri);

        float columnWidt0[] = {280f, 280f};
        Table table0 = new Table(columnWidt0).setFont(pdfFont).setBorderLeft(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1));
        table0.addCell(new Cell(0, 2).add(new Paragraph("AZƏRBAYCAN RESPUBLİKASI ƏMƏK VƏ ƏHALİNİN SOSİAL MÜDAFİƏSİ NAZİRLİYİNİN").setFontColor(new DeviceRgb(53, 165, 214)).setFont(pdfFont)).setTextAlignment(TextAlignment.LEFT).setFontSize(11).setBold().setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderLeft(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderTop(new DoubleBorder(new DeviceRgb(53,165,214),1)));
        table0.addCell(new Cell(0, 2).add(new Paragraph("Mərkəzləşdirilmiş Elektron İnformasiya Sistemi").setTextAlignment(TextAlignment.CENTER).setFontColor(new DeviceRgb(53, 165, 214)).setFont(pdfFont)).setTextAlignment(TextAlignment.LEFT).setFontSize(12).setBold().setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderLeft(new DoubleBorder(new DeviceRgb(53,165,214),1)));
        table0.addCell(new Cell(0, 2).add(new Paragraph("İş yerinə dair arayış").setFontSize(12).setPaddingLeft(4).setFontColor(new DeviceRgb(53, 165, 214)).setFont(pdfFont)).setTextAlignment(TextAlignment.CENTER).setFontSize(13).setBold().setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderLeft(new DoubleBorder(new DeviceRgb(53,165,214),1)));
        table0.addCell(new Cell(0, 2).add(new Paragraph("").setHeight(10).setFontSize(10).setPaddingLeft(4).setFontColor(new DeviceRgb(53, 165, 214)).setFont(pdfFont)).setTextAlignment(TextAlignment.CENTER).setFontSize(13).setBold().setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderLeft(new DoubleBorder(new DeviceRgb(53,165,214),1)));

        float col1 = 280f;
        float columnWidt[] = {col1, col1};
        Table table = new Table(columnWidt).setFont(pdfFont);
        table.addCell(new Cell().add(new Paragraph("No:").add(new Text(String.valueOf(1))).setItalic().setPaddingLeft(4).setFont(pdfFont)).setTextAlignment(TextAlignment.LEFT).setFontSize(9).setBorder(Border.NO_BORDER).setBorderLeft(new DoubleBorder(new DeviceRgb(53,165,214),1)));
        table.addCell(new Cell().add(new Paragraph("Tarix:").setFont(pdfFont)).setTextAlignment(TextAlignment.RIGHT).setPaddingRight(80f).setFontSize(9).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)));

        float col = 280f;
        float columnWidt1[] = {col, col};
        Table table1 = new Table(columnWidt1).setFont(pdfFont);

        table1.setBackgroundColor(new DeviceRgb(53, 165, 214)).setFontColor(new DeviceRgb(255, 255, 255));
        table1.addCell(new Cell(0, 2).add(new Paragraph("İşəgötürən barədə məlumatlar").setPaddingLeft(4).setFontSize(10).setFont(pdfFont)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));

        float columnWid2[] = {190, 190, 190};
        Table table2 = new Table(columnWid2).setFontSize(9).setFont(pdfFont).setWordSpacing(0);


        Text text=new Text("Dolacaq yer");
        ;

        table2.addCell(new Cell(0, 3).add(new Paragraph("İşəgötürənin tam adı: ").add(text.setFont(pdfFont).setItalic().setBold()))).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderLeft(new DoubleBorder(new DeviceRgb(53,165,214),1));
        table2.addCell(new Cell(0, 3).add(new Paragraph("Əlaqə telefonları: ").add(text.setFont(pdfFont).setItalic().setBold()))).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderLeft(new DoubleBorder(new DeviceRgb(53,165,214),1));

        float columnWidt5[] = {190, 190, 190};
        Table table5 = new Table(columnWidt5).setFont(pdfFont);

        table5.setBackgroundColor(new DeviceRgb(53, 165, 214)).setFontColor(new DeviceRgb(255, 255, 255));
        table5.addCell(new Cell(0, 3).add(new Paragraph("İşçi barədə məlumatlar").setPaddingLeft(4).setFontSize(10)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));

        String imegePath = "facebook-share.jpg";
        ImageData imageData = ImageDataFactory.create(imegePath);
        Image image = new Image(imageData);
        image.setMaxWidth(70f);
        image.setHeight(105f);

        float columnWid6[] = {130, 140, 140, 140};
        Table table6 = new Table(columnWid6).setFont(pdfFont);
        table6.addCell(new Cell(7, 0).add(image).setPaddingLeft(4).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        table6.addCell(new Cell().add(new Paragraph(" Soyadı :" ).add(text.setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        table6.addCell(new Cell().add(new Paragraph("Adı: " ).add(text.setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER)).setMarginBottom(0).setFontSize(8);
        table6.addCell(new Cell().add(new Paragraph("Ata adı: ").add(text.setFont(pdfFont).setItalic().setBold())).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)));

        table6.addCell(new Cell().add(new Paragraph("Şəxsiyyətini təsdiq edən sənədin")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        table6.addCell(new Cell(0, 2).add(new Paragraph("")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER)).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1));

        table6.addCell(new Cell(0, 2).add(new Paragraph("adı: " + "Dolacaq yer")).setPaddingLeft(15).setBorder(Border.NO_BORDER)).setBorderLeft(new DoubleBorder(new DeviceRgb(53,165,214),1));
        table6.addCell(new Cell().add(new Paragraph("seriyası və nömrəsi: " + "Dolacaq yer")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)));

        table6.addCell(new Cell(0, 2).add(new Paragraph("verildiyi tarix: " + "Dolacaq yer")).setPaddingLeft(15).setBorder(Border.NO_BORDER)).setBorderLeft(new DoubleBorder(new DeviceRgb(53,165,214),1));
        table6.addCell(new Cell().add(new Paragraph("FİN: " + "Dolacaq yer")).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)));

        table6.addCell(new Cell().add(new Paragraph("Doğum tarixi: " + "Dolacaq yer")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        table6.addCell(new Cell(0, 3).add(new Paragraph("")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)));

        table6.addCell(new Cell(0, 3).add(new Paragraph("Qeydiyyatda olduğu ünvan: " + "Dolacaq yer")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)));

        table6.addCell(new Cell(0, 2).add(new Paragraph("Əlaqə telefonları:  " ).add(new Text(String.valueOf(1)))).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        table6.addCell(new Cell().add(new Paragraph("Email:  " + "Dolacaq yer")).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)));

        float columnWidt7[] = {190, 190, 190};
        Table table7 = new Table(columnWidt7).setFont(pdfFont);

        table7.setBackgroundColor(new DeviceRgb(53, 165, 214)).setFontColor(new DeviceRgb(255, 255, 255));
        table7.addCell(new Cell(0, 3).add(new Paragraph("İş yeri barədə məlumatlar").setFontSize(10)).setPaddingLeft(4).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));

        String str3 = ("İnformasiya Texnologiyaları departamenti-> ");
        String str2 = ("Məşğulluq təsnifatı üzrə: ");
        float columnWidt8[] = {280f, 280f};
        Table table8 = new Table(columnWidt8).setFont(pdfFont);
        table8.addCell(new Cell(0, 2).add(new Paragraph("İşyerinin adı: " + (str3) + "Dolacaq yer").setFontSize(9f)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderLeft(new DoubleBorder(new DeviceRgb(53,165,214),1)));
        table8.addCell(new Cell(0, 2).add(new Paragraph("İşçinin vəzifəsinin (peşəsinin) adı: " + (str2) + "Dolacaq yer").setFontSize(9f)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderLeft(new DoubleBorder(new DeviceRgb(53,165,214),1)));

        float columnWidt9[] = {190, 190, 190};
        Table table9 = new Table(columnWidt9).setFont(pdfFont);

        table9.setBackgroundColor(new DeviceRgb(53, 165, 214)).setFontColor(new DeviceRgb(255, 255, 255));
        table9.addCell(new Cell(0, 3).add(new Paragraph("Digər məlumatlar").setFontSize(10)).setPaddingLeft(4).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));

        float columnWidt10[] = {280f, 280f};
        Table table10 = new Table(columnWidt10).setFont(pdfFont);
        table10.addCell(new Cell(0, 2).add(new Paragraph("Əmək müqaviləsinin bağlandığı tarix: " + "Dolacaq yer")).setTextAlignment(TextAlignment.LEFT).setFontSize(9f).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderLeft(new DoubleBorder(new DeviceRgb(53,165,214),1)));
        table10.addCell(new Cell(0, 2).add(new Paragraph("Müddətli əmək müqaviləsinin müddətinin qurtardığı tarix: " + "Dolacaq yer")).setFontSize(9f).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderLeft(new DoubleBorder(new DeviceRgb(53,165,214),1)));

        float columnWidt11[] = {190, 190, 190};
        Table table11 = new Table(columnWidt11).setFont(pdfFont);

        table11.setBackgroundColor(new DeviceRgb(53, 165, 214)).setFontColor(new DeviceRgb(255, 255, 255));
        table11.addCell(new Cell(0, 3).add(new Paragraph("Arayışın təyinatı").setFontSize(10)).setPaddingLeft(4).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));

        float columnWidt12[] = {280f, 280f};
        Table table12 = new Table(columnWidt12).setFont(pdfFont);
        table12.addCell(new Cell(0, 2).add(new Paragraph("Təyinatı: " + "Dolacaq yer").setFontSize(9f)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderLeft(new DoubleBorder(new DeviceRgb(53,165,214),1)));

        float columnWidt13[] = {190, 190, 190};
        Table table13 = new Table(columnWidt13).setFont(pdfFont);

        table13.setBackgroundColor(new DeviceRgb(53, 165, 214)).setFontColor(new DeviceRgb(255, 255, 255));
        table13.addCell(new Cell(0, 3).add(new Paragraph("Əlavə məlumatlar: ").setFontSize(10)).setPaddingLeft(4).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));

        String barcodetext="hdhdhhdhhdhasdhjshkjdsksdsadas";
        File barcode = File.createTempFile("barcode","tmp");
        Code128Writer codewriter=new Code128Writer();
        BitMatrix bitMatrix= codewriter.encode(barcodetext, BarcodeFormat.CODE_128,370,300);
        MatrixToImageWriter.writeToPath(bitMatrix,"jpeg", Paths.get(barcode.getPath()));

        File qrCode = File.createTempFile("qrcode","tmp");
        String barcodetext2="hdhdhhdhhdhasasdsadasdadhjshkjdsksdsadas";

        QRCodeWriter barcodeWriter = new QRCodeWriter();
        BitMatrix bitMatrixqr = barcodeWriter.encode(barcodetext2, BarcodeFormat.QR_CODE, 60, 60);
        MatrixToImageWriter.writeToPath(bitMatrixqr, "jpeg",  Paths.get(qrCode.getPath()));

        ImageData barcodeImageDataQr = ImageDataFactory.create(Files.readAllBytes(qrCode.toPath()));
        Image qrcodeimage = new Image(barcodeImageDataQr);
        qrcodeimage.setWidth(80f);
        qrcodeimage.setHeight(80f);


        ImageData barcodeImageData = ImageDataFactory.create(Files.readAllBytes(barcode.toPath()));
        Image bacodeimage = new Image(barcodeImageData);
        bacodeimage.setWidth(370f);
        bacodeimage.setHeight(60f);

        float columnWidt14[] = {430f, 130f};
        Table table14 = new Table(columnWidt14).setFont(pdfFont);
        table14.addCell(new Cell(0, 2).add(new Paragraph("Arayış " + "Dolacaq yer" + " əmək müqaviləsi bildirişi üzrə hazırlanmışdır").setFontSize(9f)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        table14.addCell(new Cell(0, 2).add(new Paragraph("Arayışın etibarlılıq müddəti: " + "Dolacaq yer").setFontSize(9f)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER));
        table14.addCell(new Cell(0, 2).add(new Paragraph("Arayışın etibarlılıq müddəti: " + "Dolacaq yer").setFontSize(9f)).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderBottom(new DoubleBorder(new DeviceRgb(53, 165, 214), 1)));
        table14.addCell(new Cell(0,1).add(bacodeimage).setPaddingLeft(10).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setPaddingTop(15));
        table14.addCell(new Cell(0,1).add(qrcodeimage).setPaddingLeft(30).setBorder(Border.NO_BORDER).setVerticalAlignment(VerticalAlignment.MIDDLE));
        table14.addCell(new Cell(0, 2).add(new Paragraph(barcodetext).setFontSize(9f)).setPaddingLeft(100).setBorder(Border.NO_BORDER)).setMarginBottom(12).setBorderRight(new DoubleBorder(new DeviceRgb(53,165,214),1)).setBorderLeft(new DoubleBorder(new DeviceRgb(53,165,214),1));
        table14.addCell(new Cell(0, 2).add(new Paragraph("* Ştrix kodlar arayışın sistem nömrəsini əks etdirir").setFontSize(7f)).setPaddingLeft(10).setBorder(Border.NO_BORDER).setBorderBottom(new DoubleBorder(new DeviceRgb(53,165,214),1)));
        table14.addCell(new Cell(0, 2).add(new Paragraph("Elektron sənədin doğruluğunu \"www.e-gov.az\" portalında İş yerinə dair arayış xidməti vasitəsi ilə yoxlaya bilərsiz").setFontSize(8f)).setPaddingBottom(80).setPaddingLeft(7).setTextAlignment(TextAlignment.LEFT).setBorder(Border.NO_BORDER).setBorderBottom(new DoubleBorder(new DeviceRgb(53,165,214),1)));

        document.add(table0);
        document.add(table);
        document.add(table1);
        document.add(table2);
        document.add(table5);
        document.add(table6);
        document.add(table7);
        document.add(table8);
        document.add(table9);
        document.add(table10);
        document.add(table11);
        document.add(table12);
        document.add(table13);
        document.add(table14);
        document.close();

        byte[] bytes = byteArrayOutputStream.toByteArray();
        System.out.println("salam");
        System.out.println(bytes.length);
    }
}

