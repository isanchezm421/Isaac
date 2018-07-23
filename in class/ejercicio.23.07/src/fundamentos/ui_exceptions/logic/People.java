/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos.ui_exceptions.logic;

import fundamentos.ui_exceptions.data.PeopleData;
import fundamentos.ui_exceptions.models.Person;
import java.io.FileNotFoundException;
import java.util.List;

/**
 *
 * @author ulacit
 */
public class People {
    public List<Person> load(String file) throws FileNotFoundException {
        PeopleData peopleData = new PeopleData();
        return peopleData.load(file);
    }
}
