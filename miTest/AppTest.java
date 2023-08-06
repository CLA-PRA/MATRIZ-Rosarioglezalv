package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
static Matriz m;
String valor;
int[][] a = { {1,3}, {-1,0} };
int[][] b = { {4,5 }, {-1,0}};  
int[][] rsum = { {5,8 }, {-2,0}};
int[][] rmult = { {1,5}, {-4,-5} };
@BeforeAll public static void setup(){
    m = new Matriz();
}

@Test public void testSuma(){
    assertTrue(m.suma(a,b)== rsum);
}
@Test public void testMultiplica(){
    assertTrue(m.multiplica(a,b)==rmult);
}    
}
