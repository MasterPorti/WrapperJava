import java.util.Arrays;

public class PasarPorReferencia {
    public static void main(String[] args) {
        Integer[] i = {1,2,3,4,543,345,4,43};
        System.out.println("i = (main) " + Arrays.toString(i));
        test(i);
        System.out.println("i = (en main despues de test) " + Arrays.toString(i));

    }
    public static void test(Integer[] i){
        System.out.println("i = (en test) " + Arrays.toString(i));
        i[1] = 30;
        System.out.println("i = (en test incrementado) " + Arrays.toString(i));
    }
}
