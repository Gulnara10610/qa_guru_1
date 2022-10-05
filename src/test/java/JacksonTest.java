import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import guru.qa.model.Employee;
import guru.qa.model.Employee;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static com.codeborne.pdftest.assertj.Assertions.assertThat;

public class JacksonTest {
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
        void pojoToJsonString() throws JsonProcessingException {
            Employee employee = new Employee("Mark", "James", 20);

            String json = objectMapper.writeValueAsString(employee);

            System.out.println(json);
        }

   // @Test
    //void fileToListOfPojos() throws IOException {
    //    File file = new File("src/test/resources/folder/sample3.json");
     //   List<Employee> employeeList = objectMapper.readValue(file, new TypeReference<>(){});

      //  assertThat(employeeList).hasSize(2);
      //  assertThat(employeeList.get(0).getAge()).isEqualTo(33);
       // assertThat(employeeList.get(0).getLastName()).isEqualTo("Simpson");
       // assertThat(employeeList.get(0).getFirstName()).isEqualTo("Marge");
    //}
}

