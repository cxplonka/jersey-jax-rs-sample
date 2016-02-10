/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jersey.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cplonka
 */
@XmlRootElement(name = "entry")
public class Entry {

    @XmlAttribute
    public final int id;
    @XmlElement
    public final String name;

    // jaxb need constructor
    private Entry() {
        id = 0;
        name = null;
    }

    public Entry(int id, String name) {
        this.id = id;
        this.name = name;
    }
}