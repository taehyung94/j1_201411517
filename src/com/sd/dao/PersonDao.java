package com.sd.dao.v1;

import java.util.List;

public interface PersonDao {
    public List<Person> getAllPersons();
    public void updatePerson(Person p);
    public void deletePerson(Person p);
    public Person getPerson(int id);
}
