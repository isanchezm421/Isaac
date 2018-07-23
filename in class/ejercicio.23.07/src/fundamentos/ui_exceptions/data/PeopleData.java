/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentos.ui_exceptions.data;

import fundamentos.ui_exceptions.models.Person;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class PeopleData {
    public List<Person> load(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(file));
        scanner.useDelimiter(",");
        List<Person> persons = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] items = line.split(",");
            Person newPerson = new Person();
            newPerson.setName(items[0]);
            newPerson.setAge(Integer.parseInt(items[1]));
            newPerson.setMajor(items[2]);
            persons.add(newPerson);
        }
        
        scanner.close();
        
        return persons;
    }
}
