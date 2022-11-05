public class harga {
    interface daftar{
        public void daftar();
    }
    public class Harga implements daftar{
        @Override
        public void daftar() {
            System.out.println("==========Daftar harga Sewa Motor=========");
            System.out.println("1. Motor Vario 2020");
            System.out.println("2. Motor Beat 2021");
            System.out.println("3. Motor Revo 2017");
            System.out.println("4. Motor Mio 2010");

        }
    }
}
