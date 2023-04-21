/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dataaccessobject;

import java.util.ArrayList;
import java.util.List;
import logic.Director;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wero1
 */
public class DirectorDAOTest {
    
    public DirectorDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createDirector method, of class DirectorDAO.
     */
    @Test
    public void testCreateDirectorSucces() throws Exception {
        System.out.println("createDirector");
        Director director = null;
        DirectorDAO instance = new DirectorDAO();
        boolean expResult = true;
        boolean result = instance.createDirector(director);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testCreateDirectorInvalid() throws Exception {
        System.out.println("createDirector");
        Director director = null;
        DirectorDAO instance = new DirectorDAO();
        boolean expResult = false;
        boolean result = instance.createDirector(director);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultDirector method, of class DirectorDAO.
     */
    @Test
    public void testConsultDirector() throws Exception {
        System.out.println("consultDirector");
        DirectorDAO instance = new DirectorDAO();
        List<Director> expResult = null;
        List<Director> result = instance.consultDirector();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDirector method, of class DirectorDAO.
     */
    @Test
    public void testUpdateDirector() throws Exception {
        System.out.println("updateDirector");
        Director director = null;
        DirectorDAO instance = new DirectorDAO();
        boolean expResult = false;
        boolean result = instance.updateDirector(director);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteDirector method, of class DirectorDAO.
     */
    @Test
    public void testDeleteDirector() throws Exception {
        System.out.println("deleteDirector");
        int idDirector = 0;
        DirectorDAO instance = new DirectorDAO();
        boolean expResult = false;
        boolean result = instance.deleteDirector(idDirector);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
