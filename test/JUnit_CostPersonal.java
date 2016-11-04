import m05_uf2_activitat2.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JUnit_CostPersonal {
    private static CostPersonal cp;
    
    public JUnit_CostPersonal() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        cp = new CostPersonal();
    }
    
    @AfterClass
    public static void tearDownClass() {
        cp = null;
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public final void testCostPersonal() throws  TreballadorNoValid {
        Treballador treballador1 = new Treballador(0, 4000, 0);
        Treballador treballador2 = new Treballador(1, 3000, 40);
        Treballador treballador3 = new Treballador(2, 1700, 20);
        
        Treballador[] arrayTreballadors = {treballador1, treballador2, treballador3};

        assertEquals(9100, cp.CostDelPersonal(arrayTreballadors), 0);
    }

    @Test
    public final void testCostPersonal2() throws TreballadorNoValid{
    
        Treballador treballador4 = new Treballador(-1, 1700, 20);
        Treballador[] arrayTreballadors = {treballador4};
        try{
            
            assertEquals(2100, cp.CostDelPersonal(arrayTreballadors), 0);
            fail("Esta mal");
        }catch(Exception e){
            
        }
    }
    
    @Test
    public final void testCostPersonal3() throws TreballadorNoValid{
    
        Treballador treballador5 = new Treballador(2, -1700, 20);
        Treballador[] arrayTreballadors = {treballador5};
        try{
            assertEquals(-1300, cp.CostDelPersonal(arrayTreballadors), 0);
            fail("Esta mal");
        }catch(Exception e){
            
        }
    }
    
    @Test
    public final void testCostPersonal4() throws TreballadorNoValid{
    
        Treballador treballador6 = new Treballador(2, 1700, -20);
        Treballador[] arrayTreballadors = {treballador6};
        try{
            assertEquals(1300, cp.CostDelPersonal(arrayTreballadors), 0);
            fail("Esta mal");
        }catch(Exception e){
            
        }
    }
    
        @Test
    public final void testCostPersonal5() throws TreballadorNoValid{

        try{
            assertEquals(true, cp.directorOSubdirector(1));
        }catch(Exception e){}
    }
    
        @Test
    public final void testCostPersonal6() throws TreballadorNoValid{
    
        Treballador treballador6 = new Treballador(2, 1700, -20);
        Treballador[] arrayTreballadors = {treballador6};
        try{
            assertEquals(1300, cp.CostDelPersonal(arrayTreballadors), 0);
            fail("Esta mal");
        }catch(Exception e){
            
        }
    }
    
        @Test
    public final void testCostPersonal7() throws TreballadorNoValid{
    
        try{
            assertEquals(3000, cp.calculCostFinal(1000, 2000),0);
        }catch(Exception e){
            
        }
    }

        @Test
    public final void testCostPersonal8() throws TreballadorNoValid{
    
        try{
            assertEquals(3040, cp.calculCostFinal(1000, 2000,2,20),0);
        }catch(Exception e){
            
        }
    }

    
}
