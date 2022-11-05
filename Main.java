public class Main {
    public static void main(String [] args){
        harga iya= new harga();
        data aku= new data();

        System.out.println("==========================================");
        System.out.println("sewa motor :");
        System.out.printf("===========================================");
        new harga.daftar() {
            @Override
            public void daftar() {

            }
        };
        aku.harga();
        aku.data();
        aku.output();
        System.out.println("==========================================");
        System.out.println("terimakasih");
    }
}