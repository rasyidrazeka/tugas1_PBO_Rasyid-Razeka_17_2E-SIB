package tugas1;
public class nomor2 {
    public static void main(String[] args){
        int jumlah=0;
        int[] nim = {2, 1, 4, 1, 7, 6, 2, 0, 7, 7};
        for(int i=0; i<nim.length; i++){
            jumlah+=nim[i];
        }
        System.out.println("Hasil dari nim " + " adalah " + jumlah);
    }
}