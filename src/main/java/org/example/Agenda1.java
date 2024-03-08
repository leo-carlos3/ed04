package org.example;

import java.util.List;

public interface Agenda1 {
    /**
     * @param name
     * @param phone
     */
    void addContact(String name, String phone);

    /**
     * @param name
     */
    void removeContact(String name);

    /**
     * @param name
     * @param oldPhone
     * @param newPhone
     */
    void modifyPhoneNumber(String name, String oldPhone, String newPhone);

    /**
     * @return
     */
    List<Persona> getContacts();
}
