package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

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

        System.out.println("=== TESTE 2: SELLER findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for(Seller obj2 : list){
            System.out.println(obj2);
        }

        System.out.println("=== TESTE 3: SELLER findAll ===");
        List<Seller> list2 = sellerDao.findAll();

        for(Seller all : list2){
            System.out.println(all);
        }

        // System.out.println("=== TESTE 4: SELLER Insert ===");
        // Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", birthDate, 4000.00, department);
        // sellerDao.insert(newSeller);

        // System.out.println("Insert! New id = " + newSeller.getId());

        // System.out.println("=== TESTE 5: SELLER Update ===");
        // seller = sellerDao.findByID(9);
        // seller.setName("Diego");
        // sellerDao.update(seller);
        // System.out.println("UPDATE Complet");

        System.out.println("=== TESTE 6: SELLER Delete ===");
        
        sellerDao.deleteByID(8);
        System.out.println("Delete Complet");
    }
}
