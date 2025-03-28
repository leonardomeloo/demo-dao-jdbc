package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = "15/01/1994";
        LocalDate birthDate = LocalDate.parse(data,df);

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", birthDate, 3000.00, obj);
        System.out.println(obj);
        System.out.println(seller);
    }
}
