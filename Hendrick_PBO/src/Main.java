import javax.swing.JOptionPane;

public class Main{
    public static void main (String [] args){
        String isi,pil_string,ulang_string;
        int pil,ulang;
        Nasabah xx;
        Deposit satu=new Deposit();
        xx = satu;


        do { //perulangan
            isi="1. Pendaftaran Nasabah Deposit\n"+"2. Cetak Data\n"+"3. Tambah Saldo\n"
                    + "4. Cetak Saldo\n"+"5. Daftar Tabungan :\n"+
                    "6. Cetak Saldo\n"+"7. Keluar\n"+"Masukkan pilihan anda :";
            pil_string=JOptionPane.showInputDialog(null,isi, "BANK ISTAKPRIND",
                    JOptionPane.QUESTION_MESSAGE);
            pil=Integer.parseInt(pil_string);
            switch(pil) { //perkondisian
                case 1:{
                    xx.indftNasabah();
                    xx.inputJenis();
                    JOptionPane.showMessageDialog(null, "Input Selesai, klik OK untuk melanjutkan","INPUT SELESAI",JOptionPane.INFORMATION_MESSAGE);
                    break;}
                case 2:{xx.cetak_nasabah();
                    break;}
                case 3: {xx.penyetoran();
                    break;}
                case 4:{xx.cetak_saldo();
                    break;}
                case 5: {
                    Tabungan tab1=new Tabungan();
                    xx = tab1;
                    xx.indftNasabah();xx.inputJenis();xx.cetak_nasabah();
                    break;}
                case 6:{


                    break;}
                case 7:JOptionPane.showMessageDialog(null,"Klik OK untuk keluar");
                    break;
            }
            ulang_string=JOptionPane.showInputDialog("Mau transaksi lagi?\nJika YA input 1\n" +
                    "jika TIDAK input 0\n"+"masukkan pilihan :");
            ulang=Integer.parseInt(ulang_string);
        }
        while(ulang==1);
    }

}