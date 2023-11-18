


class Fibonacii{

    static void fibonaciiSeries(int N){//without rec

        int n1 = 0;
        int n2 = 1;

        System.out.println(n1);
        System.out.println(n2);

        int itr1 = 0;

        for(int i=2;i<=N;i++){
            int c1 = n1 +n2;
            n1 = n2;
            n2 = c1;
            // System.out.println(c1);

            itr1++;
        }

        System.out.println("Iterations: "+itr1);
    }

    public static void main(String[] args) {
        
        fibonaciiSeries(10);
    }
}




package daa_practice;
public class fib  //with recursion 
{   
	static int n1=0,n2=1,n3;
	void fib(int i)
	{
		 if(i>=1)
		 {
			 n3=n1+n2;
			 System.out.print(" "+n3);
			 n1=n2;
			 n2=n3;
			 fib(i-1);
		}
	}	
	public static void main(String[] args) 
	{
		System.out.print(n1+" "+n2);
		fib f=new fib();
		f.fib(10);
	}
}
