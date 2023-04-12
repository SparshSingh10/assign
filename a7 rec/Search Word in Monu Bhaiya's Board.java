import java.util.*;
public class Main {
    public static void main (String args[]) {
  
        Scanner nnncc=new Scanner(System.in);
        int mm=nnncc.nextInt();
   
        int nn=nnncc.nextInt();
   
        int k=nnncc.nextInt();
   
        char[][] aarr=new char[mm][nn];
  


        for(int i=0;i<aarr.length;i++){
            String ass=nnncc.next();
  
 
            for(int j=0;j<nn;j++){
 
                aarr[i][j]=ass.charAt(j);
            }
        }
  
        List<String> lliii=new ArrayList<>();
  
        for(int i=0;i<k;i++){
            String str=nnncc.next();
  
            lliii.add(str);
   
        }
        List<String> annnss=new ArrayList<>();
         for(int i=0;i<lliii.size();i++){
             if(tt(aarr,lliii.get(i))==true){
                annnss.add(lliii.get(i));
             }
        }
        Collections.sort(annnss);
         for(int i=0;i<annnss.size();i++){
             System.out.print(annnss.get(i)+" ");
         }
 
    }
      public static boolean tt(char[][] bb, String ww) {
        for (int i = 0; i < bb.length; i++) {
			for (int j = 0; j < bb[0].length; j++) {
 				if (ww.charAt(0) == bb[i][j]) {
					boolean ass = ws(bb, i, j, ww, 0);
	

     				if (ass == true) {
						
						return true;

					}
				}

			}
		}

		return false;
    }
 
 
    public static boolean ws(char[][] bb, int ccrr, int pp, String ww, int indx) {
		if (indx == ww.length()) {

			return true;
	
    	}


		if (pp < 0 || ccrr < 0 || pp >= bb[0].length || ccrr >= bb.length || ww.charAt(indx) != bb[ccrr][pp]) {
			return false;
	
    	}
	
    	bb[ccrr][pp] = '*';
	
    	int[] r = { -1, 0, 1, 0};
	
    	int[] c = { 0, 1, 0, -1};
		for (int i = 0; i < c.length; i++) {
	
    		boolean ass = ws(bb, ccrr + r[i], pp + c[i], ww, indx + 1);
			if (ass == true) {
				bb[ccrr][pp]=ww.charAt(indx);
   
                return true;
			}


	
    	}
	
    	bb[ccrr][pp] = ww.charAt(indx);
		return false;

	}
}