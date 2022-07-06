
public class ProgressBar 
{
	public static void showProgressBar_i(String nombre) 
	{
    	int t,x, i = 0;
        while(i < 26) 
        {
        	t=i+1;
            System.out.print("[");
            for (int j=0;j<i;j++) 
            {
                System.out.print("#");
            }

            for (int j=0;j<26-i;j++) {
                System.out.print(" ");
            }

            System.out.print("] "+  i*1 + "%\t");

            System.out.print("Loading   "+t+" de "+nombre.length()+"\t");
    		

            for(x = 0; x <= i; x++)
    		{
    			System.out.print(nombre.charAt(x));
    		}
            if(i<26) {
                System.out.print("\r");
                try {
                	Thread.sleep(300);	
                }catch(Exception e) {}
                
            }
            i++;
        }
        System.out.println();
    }
    	
	
    public static void main(String[] args)
    {
    	String nombre = "michael.pillaga@epn.edu.ec";
    	showProgressBar_i(nombre);


        

    }	
}
