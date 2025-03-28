package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = "15/01/1994";
        LocalDate birthDate = LocalDate.parse(data, df);

        Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", birthDate, 3000.00, obj);

        System.out.println(obj);

        SellerDao sellerDao = DaoFactory.creatSellerDao();
        System.out.println(seller);
        System.out.println("=== TESTE 1: SELLER findById ===");
        Seller seller2 = sellerDao.findByID(3);
        System.out.println(seller2);

    }
}
