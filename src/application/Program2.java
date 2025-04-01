package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class Program2 {
  public static void main(String[] args) {
  DepartmentDao departmentDao = DaoFactory.creatDepartmentDao();
   System.out.println(departmentDao.findByID(5));

   System.out.println(departmentDao.findAll());
}
}
