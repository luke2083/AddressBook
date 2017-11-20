package pl.lmnt.addressbook.wrapper;

import pl.lmnt.addressbook.model.Person;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by luke on 12.11.2017.
 *
 * Pomocnicza klasa z listą osób stworzona na pottrzeby zapisu do XML
 *
 */

@XmlRootElement(name = "persons")
public class PersonListWrapper {

    private List<Person> persons;

    @XmlElement(name="person")
    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

}
