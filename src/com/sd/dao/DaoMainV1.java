package com.sd.dao.v1;

public class DaoMainV1 {
    public static void main(String[] args) {
        Person p;
        PersonDao personDao = new PersonDaoImpl();
        System.out.println("--- finding all...");
        for (Person pi:personDao.getAllPersons()) {
            System.out.println("reading... "+pi.getId() +", "+pi.getName());
        }
        p =personDao.getAllPersons().get(0);
        p.setName("th new");
        personDao.updatePerson(p);
        System.out.println("--- see if updated...");
        p=personDao.getPerson(0);
        System.out.println(p.getId() +", "+p.getName());

        System.out.println("--- deleting...");
        personDao.deletePerson(p);

        System.out.println("--- finding all after deleting...");
        for (Person pi:personDao.getAllPersons()) {
            System.out.println("reading... "+pi.getId() +", "+pi.getName());
        }
   }
}