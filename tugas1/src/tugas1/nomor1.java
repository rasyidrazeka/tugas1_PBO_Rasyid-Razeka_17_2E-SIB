package tugas1;
public class nomor1 {
    public static void main(String[] args){
        int[] nim = {2, 1, 4, 1, 7, 6, 2, 0, 7, 7};
        int indeks=0;
        //baris
        int i=0;
        while(i<4){
            //spasi
            int j=i;
            while(j<nim.length){
                System.out.print(" ");
                j++;
            }
            //cetak array
            int k=0;
            while(k<=i){
                System.out.print(nim[indeks]+" ");
                indeks++;
                k++;
            }
            System.out.println();
            i++;
        }
    }
}