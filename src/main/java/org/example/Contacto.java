package org.example;

import java.util.ArrayList;
import java.util.List;

class Contacto {
    private String name;
    private List<String> phones;

    /**
     *
     * @param name
     * @param phone
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return
     */
    public List<String> getPhones() {
        return this.phones;
    }
}