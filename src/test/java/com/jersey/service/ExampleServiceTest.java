package com.jersey.service;

import com.jersey.jaxb.Entry;
import javax.ws.rs.core.Application;
import javax.xml.bind.JAXBException;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * https://jersey.java.net/documentation/latest/test-framework.html
 * 
 * @author cplonka
 */
public class ExampleServiceTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(ExampleService.class);
    }

    @Test
    public void testGet() {
        assertEquals(
                "Hello null!",
                target("/api/hello").request().get(String.class));
    }

    @Test
    public void testGetName() {
        assertEquals(
                "Hello world!",
                target("/api/hello").queryParam("name", "world").request().get(String.class));
    }

    @Test
    public void testXML() throws JAXBException {
        Entry entry = target("/api/xml").request().get(Entry.class);
        
        assertEquals(0, entry.id);
        assertEquals("XML", entry.name);
    }
    
    @Test
    public void testJSON() throws JAXBException {
        Entry entry = target("/api/json").request().get(Entry.class);
        
        assertEquals(0, entry.id);
        assertEquals("JSON", entry.name);
    }
}
