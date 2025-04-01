package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
  public static void main(String[] args) {
  DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();
   System.out.println(departmentDao.findByID(2));

   System.out.println(departmentDao.findAll());
   Department dep = new Department("RH");
   
  //  departmentDao.insert(dep);
  //  System.out.println("Insert Complet. ID: " + dep.getId() + " Name: " + dep.getName());
  
  dep = departmentDao.findByID(8);
  dep.setName("Contrução");
  // departmentDao.update(dep);
  // System.out.println("UPDATE COMPLETE");

  departmentDao.deleteByID(6);
  System.out.println("Delete Complete.");
}
}
