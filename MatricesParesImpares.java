package PACKAGE_NAME;
import java.util.Scanner;
public class MatricesParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese la dimension de la matriz:");
        int d = sc.nextInt();
        int[][] matriz = new int[d][d];
        MatricesParesImpares m = new MatricesParesImpares();
        m.llenarmatriz(matriz,sc,d);
        m.mostrarmatriz(matriz);
    }

    public int[][] llenarmatriz(int[][] matriz, Scanner sc, int d){
        System.out.println("ingrese los valores de su matriz de orden " + d + ": ");
        for (int i = 0 ; i < d ; i++){
            for (int j = 0 ; j < d ; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        return matriz;
    }
    public void mostrarmatriz(int[][] matriz){
        System.out.println("su matriz es: ");
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0 ; j < matriz[i].length ; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
