public class PasarPorValor {
    public static void main(String[] args) {
        Integer i = 10;
        System.out.println("i = (main) " + i);
        test(i);
        System.out.println("i = (en main despues de test) " + i);

    }
    public static void test(Integer i){
        System.out.println("i = (en test) " + i);
        i = 30;
        System.out.println("i = (en test incrementado) " + i);
    }
}
