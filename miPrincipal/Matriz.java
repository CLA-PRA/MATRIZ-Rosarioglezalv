package miPrincipal;

public class Matriz {
    public void imprime (int [][] c){
        for (int x=0; x < c.length; x++) {
                      for (int y=0; y < c[x].length; y++) {
                        System.out.print (c[x][y]);
                        if (y!=c[x].length-1) System.out.print("\t");
                      }
                      System.out.println();
                    }
        }
    public int[][] suma (int [][] A, int [][] B){
             
               int m= A.length;
               int o= B.length;
               // nueva matriz 
               int [][] C= new int [m][o];
                          
               for (int j = 0; j < A.length; j++) {
                    for (int k = 0; k < B.length; k++) {
                     // aquí se multiplica la matriz
                      
                      }
                   }
               return C;
            }
        
        public int[][] multiplica (int [][] A, int [][] B){
             
               int m= A.length;
               int o= B[0].length;
               // nueva matriz 
               int [][] C= new int [m][o];
                          
               for (int i = 0; i < A.length; i++) {
                    for (int j = 0; j < B.length; j++) {
                        for (int k = 0; k < A.length; k++) {
                            // aquí se multiplica la matriz
                           
                        }
                    }
                }
               return C;
            }
    
}