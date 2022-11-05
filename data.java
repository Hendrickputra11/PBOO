import java.util.Scanner;

    public class data extends Awaldata{

        private String nama;
        private String alamat;
        private int nohp;
        private int pil;
        private int tanggal;

        private int harga;

        Scanner input = new Scanner(System.in);

        @Override
        public void data() {
            System.out.println("===========Masukan data anda===========");
            System.out.print("Masukan nama anda   : ");
            nama = input.nextLine();
            System.out.print("Masukan alamat anda : ");
            alamat = input.nextLine();
            System.out.print("Masukan no Hp anda    : ");
            nohp = input.nextInt();
            System.out.print("Masukan Pilihan anda  : ");
            pil = input.nextInt();
            System.out.print("Masukan tanggal pengembalian : ");
            tanggal = input.nextInt();
        }

        @Override
        public void harga() {
            switch (pil){
                case 1:
                    harga = 50000;
                    System.out.println("Merek Motor : vario 2020");
                    System.out.println("Harga sewa  :" +harga);
                    System.out.println("Pengembalian tanggal :" +tanggal);
                    break;
                case 2:
                    harga = 40000;
                    System.out.println("Merek Motor : beat 2021");
                    System.out.println("Harga sewa  :" +harga);
                    System.out.println("Pengembalian tanggal :" +tanggal);
                    break;
                case 3:
                    harga = 30000;
                    System.out.println("Merek Motor : revo 2017");
                    System.out.println("Harga sewa  :" +harga);
                    System.out.println("Pengembalian tanggal :" +tanggal);
                    break;
                case 4:
                    harga = 20000;
                    System.out.println("Merek Motor : mio 2010");
                    System.out.println("Harga sewa  :" +harga);
                    System.out.println("Pengembalian tanggal :" +tanggal);
                    break;
                default:
                    System.out.println("Tidak ada dalam pilihan");
            }
        }

        @Override
        public void output() {
            System.out.println("===========Bukti sewa motor===========");
            System.out.println("Nama Penyewa : "+nama);
            System.out.println("Alamat Penyewa : "+alamat);
            System.out.println("No hp Penyewa : "+nohp);
            harga();
        }
    }
