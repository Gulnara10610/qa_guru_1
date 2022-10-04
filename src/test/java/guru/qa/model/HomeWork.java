package guru.qa.model;
import guru.qa.FileParseTest;
import org.junit.jupiter.api.Test;

import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;
import java.io.InputStream;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
public class HomeWork {
    ClassLoader cl = FileParseTest.class.getClassLoader();

    @Test
    void zipXls() throws Exception {
        InputStream is = cl.getResourceAsStream("folder/Grafik_otpuskov_2016_full_holidays.zip");
        ZipInputStream zis = new ZipInputStream(is);
        ZipEntry entry;
        while ((entry = zis.getNextEntry()) != null) {
            String name = entry.getName();
            long size = entry.getSize();
            System.out.printf("File name: %s \t File size: %d \n", name, size);
            assertThat(entry.getName()).isEqualTo("Grafik_otpuskov_2016_full_holidays.xlsm");
            assertThat(entry.getSize()).isEqualTo(47271);

        }
    }
    @Test
    void zipPdf() throws Exception {
        InputStream is = cl.getResourceAsStream("folder/Aish.zip");
        ZipInputStream zis = new ZipInputStream(is);
        ZipEntry entry;
        while ((entry = zis.getNextEntry()) != null) {
            String namePdf = entry.getName();
            System.out.println(namePdf);
        }
    }
    @Test
    void zipCsv() throws Exception {
        InputStream is = cl.getResourceAsStream("folder/sample4.zip");
        ZipInputStream zis = new ZipInputStream(is);
        ZipEntry entry;
        while ((entry = zis.getNextEntry()) != null) {
            String name = entry.getName();
            long size = entry.getSize();
            System.out.printf("File name: %s \t File size: %d \n", name, size);
            assertThat(entry.getName()).isEqualTo("sample4.csv");
            assertThat(entry.getSize()).isEqualTo(7918);
        }
    }
    @Test
    void json()throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        InputStream is = Test.class.getResourceAsStream("folder/sample3.json");

    }
}
