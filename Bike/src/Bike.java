import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Bike implements Comparable <Bike>{
    int w, d1;
    void Make()
    {}
    void Use()
    {}
    void Repair()
    {}
    void Buy()
    {
        System.out.println("Велосипед куплен");
    }
    public int compareTo(Bike b)
    {
        if(this.d1*this.w>b.w*b.d1)
            return 1;
        else
        {
            if (this.d1*this.w<b.w*b.d1)
                return -1;
            else
                return 0;

        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количетсво велосипедов: ");
        byte n = in.nextByte();
        Bike[] a = new Bike[n];
        for (int i=0;i<n;i++)
        {
            Random rand = new Random();
            int k = rand.nextInt(3)+1;
            switch(k)
            {
                case 1:
                {a[i] = new Velo1(rand.nextInt(50)+1);
                    break;}
                case 2:
                {a[i] = new Velo2(rand.nextInt(50)+1);
                    break;}
                case 3:
                { a[i] = new Velo3(rand.nextInt(50)+1);
                    break;}
                default:
                    break;
            }
        }
        for (int i=0;i<n;i++)
        {
/*if(a[i].w==1)
Repair.rep(a[i]);*/
/*if(a[i].getClass()==Velo1.class)
Repair.rep(a[i]);*/
            if(a[i] instanceof Velo1)
                Repair.rep(a[i]);
        }
        Arrays.sort(a);
        for (int i=0;i<n;i++)
        {
            System.out.println(i+1 +") Велосипед с общим диаметром всех колёс: " + a[i].d1*a[i].w + ", и количеcтвом колёс: " + a[i].w);
        }
    }
}
class Velo1 extends Bike
{
    {w=1;}
    Velo1(int d1)
    {this.d1=d1;}
    void Use()
    {
        System.out.println("Вы используете одноколёсный велосипед");
    }
    void Make()
    {
        System.out.println("Вы собрали одноколёсный велосипед");
    }
    void Repair()
    {
        System.out.println("Вы починили одноколёсный велосипед " );
    }
}
class Velo2 extends Bike
{
    {w=2;}
    Velo2(int d1)
    {this.d1=d1;}
    void Use()
    {
        System.out.println("Вы используете двухколёсный велосипед");
    }
    void Make()
    {
        System.out.println("Вы собрали двухколёсный велосипед");
    }
    void Repair()
    {
        System.out.println("Вы починили двухколёсный велосипед");
    }
}
class Velo3 extends Bike
{
    {w=3;}
    Velo3(int d1)
    {this.d1=d1;}
    void Use()
    {
        System.out.println("Вы используете трёхколёсный велосипед");
    }
    void Make()
    {
        System.out.println("Вы собрали трёхколёсный велосипед");
    }
    void Repair()
    {
        System.out.println("Вы починили трёхколёсный велосипед");
    }
}
class Repair
{
    public static void rep(Bike vel)
    {
        vel.Repair();
    }
}