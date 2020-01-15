import java.util.Scanner;
public class ejerc14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner mk = new Scanner(System.in);
		int x,i=0,z=0,k=0, suma=0 ,neg=0, ceros=0, acum=0, acumn=0;
		do {
			x = mk.nextInt();
			if(x>0) {
				suma+=x;
				acum++;
			}else if(x<0){
				neg+=x;
				acumn++;
			}else if(x==0){	
				ceros++;
				
			}
			
			
		k+=1;	
			
		}while(k<=10);
			
		System.out.println(suma/acum);
		System.out.println(neg/acumn);
		System.out.println(ceros);
		
		
		
		mk.close();
		
		
	}

}
