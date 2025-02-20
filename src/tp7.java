/**
 * @(#)tp7.java
 *
 * tp7 application
 *
 * @author 
 * @version 1.00 2025/2/20
 */
 
public class tp7 {
    
    public static void main(String[] args) {
    	
    	int[][] M =new int[50][50];
    	int nl,nc,i,j;
    	do {
    		System .out.print ("entrez un enetier strictement positif inférieur à50:  ");
    		nl=Clavier.lireInt();
    		if (nl>=50|| nl<0){
    			System .out.print("valeur invalide.veyiller entrer un entier positif inférieur à50:");
    		}
  
    	}while(nl>=50|| nl<0);
    	
    	System .out.print ("la valeur de nl est  " + nl);
    	do {
    		System .out.print ("entrez un enetier strictement positif inférieur à50:  ");
    		nc=Clavier.lireInt();
    		if (nc>=50|| nc<0){
    			System .out.print("valeur invalide.veyiller entrer un entier positif inférieur à50:");
    		}
    }while(nc>=50|| nc<0);
    	
    	System .out.print ("la valeur de nl est  " + nc);
    	for (i=0;i<nl;i++){
    		for(j=0;j<nc;j++){
    			System .out.print ("remplir M ["+i+","+j+"]");
    			M[i] [j]=Clavier.lireInt();
    		}
    			
    			}
    	}
    	
    
}
