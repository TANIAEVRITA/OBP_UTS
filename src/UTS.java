import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class UTS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer>antrian = new LinkedList<>();
        System.out.println("Program Antrian (Queue)");
        System.out.print("Masukkan banyak percobaan : ");
        int n = input.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Input (1) Menambahkan angka ke dalam antrian");
            System.out.println("Input (2) Menghapus angka paling depan di dalam antrian");
            System.out.println("Input (3) Melihat isi antrian");
            System.out.print("Masukkan input : ");
            int k = input.nextInt();
            if(k==1)
            {
                System.out.print("Masukkan angka ke dalam antrian : ");
                antrian.add(input.nextInt());
                IsiAntrian(antrian);
            }
            else if(k==2)
            {
                if(!antrian.isEmpty())
                {
                    System.out.print(String.format("%s %d", "Anda menghapus angka : ", antrian.peek()));
                    antrian.remove();
                    IsiAntrian(antrian);
                }
            }
            else if(k==3)
            {
                if(!antrian.isEmpty())
                {
                    IsiAntrian(antrian);
                }
            }
            System.out.println();
        }
    }

    static void IsiAntrian(Queue antrian)
    {
        System.out.println();
        System.out.print("Isi antrian : ");
        System.out.println(antrian);
    }
}

