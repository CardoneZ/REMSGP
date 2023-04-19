/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dataaccessobject;

import java.util.ArrayList;
import logic.Codirector;
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
public class CodirectorDAOTest {
    
    public CodirectorDAOTest() {
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
     * Test of createCodirector method, of class CodirectorDAO.
     */
    @Test
    public void testCreateCodirectorSucces() throws Exception {
        System.out.println("createCodirector");
        Codirector codirector = new Codirector();
        codirector.setTeacherId(11);
        
        CodirectorDAO instance = new CodirectorDAO();
        boolean expectedResult = true;
        boolean result = instance.createCodirector(codirector);
        assertEquals(expectedResult, result);
    }
    
    public void testCreateCodirectorInvalid() throws Exception {
        System.out.println("createCodirector");
        Codirector codirector = new Codirector();
        codirector.setTeacherId(11);
        
        CodirectorDAO instance = new CodirectorDAO();
        boolean expectedResult = true;
        boolean result = instance.createCodirector(codirector);
        assertEquals(expectedResult, result);
    }

    /**
     * Test of consultCodirector method, of class CodirectorDAO.
     */
    @Test
    public void testConsultCodirector() throws Exception {
        System.out.println("consultCodirector");
        CodirectorDAO instance = new CodirectorDAO();
        ArrayList<Codirector> expResult = null;
        ArrayList<Codirector> result = instance.consultCodirector();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of updateCodirector method, of class CodirectorDAO.
     */
    @Test
    public void testUpdateCodirector() throws Exception {
        System.out.println("updateCodirector");
        Codirector codirector = null;
        CodirectorDAO instance = new CodirectorDAO();
        boolean expResult = false;
        boolean result = instance.updateCodirector(codirector);
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteCodirector method, of class CodirectorDAO.
     */
    @Test
    public void testDeleteCodirector() throws Exception {
        System.out.println("deleteCodirector");
        int idCodirector = 0;
        CodirectorDAO instance = new CodirectorDAO();
        boolean expResult = false;
        boolean result = instance.deleteCodirector(idCodirector);
        assertEquals(expResult, result);
    }
    
}
