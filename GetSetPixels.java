import java.io.IOException;
import java.io.File;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.lang.Math.*;
import java.util.Scanner;


public class GetSetPixels{
static int ans, cnt,total,g;
  public static void main(String args[])throws IOException{
    BufferedImage img = null;
    File f = null;

   // String csvFile = "/home/hp/project/csv/finalcsv.csv";
    
   // FileWriter writer = new FileWriter(csvFile,true);
    //read image

    try{
	Scanner scanner=new Scanner(System.in);
	System.out.print("Enter a File Name: ");
	String input2=scanner.nextLine();
	File file1=new File(input2);
	String abc=null;
      	String s="/home/hp/project/final/images/";
    	s=s+input2;	
	 f = new File(s);
     	 img = ImageIO.read(f); 

    }
	catch(IOException e)
	{
     	 System.out.println(e); 
   	 }

    //get image width and height
    int width = img.getWidth();
    int height = img.getHeight();
	System.out.println(width);
	System.out.println(height);
    /**
     * Since, Sample.jpg is a single pixel image so, we will
     * not be using the width and height variable in this
     * project.
     */
	int position1=0;
	int diff[]=new int[8];
	int mul[]=new int[8];
	int sum1[]=new int[181];	
	int add=0;
	int m=2;
	int t=0;
	int minvalue;
	int position=0;
	int mod[]=new int[sum1.length];

	int input[] = new int[8];
	int a[][]=new int[width][height];
	int a1[][]=new int[width][height];
		for(int j=0;j<width;j++)
	        {
                     for(int i=0;i<height;i++)	
		     {
			a[i][j]=img.getRGB(i,j);

		     }
	        }

//############################################################################################################

for(int j=0;j<width;j++)	// change value to 1&0 in a[][]
{
			for(int i=0;i<height;i++)
			{
				if(a[i][j]!=-1)
				a[i][j]=1;

				else
				a[i][j]=0;
			}
}

for(int j=0;j<width;j++)	// print a[][]
{
			for(int i=0;i<height;i++)
			{
				System.out.print(a[i][j]);
			}

		System.out.print("\n");	
}

//#################################################################################################################################
	
  
  

  for(int i=1;i<height-1;i++)	//boundary creation
   {		
			for(int j=1;j<width-1;j++)
			{
				if(a[i][j]==1)
				{
					ans=check_boundarypt(a, i, j);
							if(ans==1)
							{
								a1[i][j]=1;	//boundary matrix
							}
				}
				
			}

		System.out.print("\n");	
    }  

		for(int j=1;j<width-1;j++)	// print a1[][]
		{
			for(int i=1;i<height-1;i++)
			{
				System.out.print(a1[i][j]);
			}

		System.out.print("\n");	
		}
//###############################################################################################################################

	for(int i=1;i<height-1;i++)	//calculation of number of 1's as border points
	{		
			for(int j=1;j<width-1;j++)
			{
				if(a1[i][j]==1)
				{
					total++;
				}
				
			}
	}
System.out.println("Total no. of 1s=" +total); 

//###############################################################################################################################



for(int i=1;i<height-1;i++)	//chain coding
  {		
			for(int j=1;j<width-1;j++)
			{
				if(a1[i][j]==1)
				{
					g=chaincode(a1, i ,j);
					
				}
				
			}

			
  } 
if(g==1)
 {
		        for(int p=1;p<width-1;p++)	// print a1[][]
			  {
				for(int q=1;q<height-1;q++)
				  {
					System.out.print(a1[q][p]);
				  }

					System.out.print("\n");	
			 }
  }	
//###################################################################################################################################
 
	int two=0;
	int three=0;
	int four=0;
	int five=0;		//Count frequency of numbers
	int six=0;
	int seven=0;
	int eight=0;
	int nine=0;
	int sum=0;		
			 for(int c=1;c<width-1;c++)	
			  {
				for(int d=1;d<height-1;d++)
				  {
					if(a1[c][d]==2)
					{
						two++;
					}
					if(a1[c][d]==3)
					{
						three++;
					}
					if(a1[c][d]==4)
					{
						four++;
					}
					if(a1[c][d]==5)
					{
						five++;
					}
					if(a1[c][d]==6)
					{
						six++;
					}
					if(a1[c][d]==7)
					{
						seven++;
					}
					if(a1[c][d]==8)
					{
						eight++;
					}
					if(a1[c][d]==9)
					{
						nine++;
					}
				  }
			}
			sum=two+three+four+five+six+seven+eight+nine;
			System.out.print("\n Two\t" +two);
			System.out.print("\n Three\t" +three);
			System.out.print("\n Four\t" +four);
			System.out.print("\n Five\t" +five);
			System.out.print("\n Six\t" +six);
			System.out.print("\n Seven\t" +seven);
			System.out.print("\n Eight\t" +eight);
			System.out.print("\n Nine\t" +nine);
			System.out.println("\n Sum="+sum);
                       
        

                      /*  writer.append(String.valueOf(two));
                        writer.append(',');
                        writer.append(String.valueOf(three));
                        writer.append(',');
                        writer.append(String.valueOf(four));
                        writer.append(',');
                        writer.append(String.valueOf(five));
                        writer.append(',');
                        writer.append(String.valueOf(six));
                        writer.append(',');
                        writer.append(String.valueOf(seven));
                        writer.append(',');
                        writer.append(String.valueOf(eight));
                        writer.append(',');
                        writer.append(String.valueOf(nine));
                        writer.append(',');
                        writer.append('\n');
                        writer.flush();
                        writer.close();*/


//#################################################################################################################################
                        
      
			input[0]=two;
			input[1]=three;
			input[2]=four;
			input[3]=five;
			input[4]=six;
			input[5]=seven;
			input[6]=eight;
			input[7]=nine;


			for(int b=0;b<8;b++)
			{
	
				//System.out.print("\t"+input[b]);

				//mod[b]=Math.abs(sum[b]);
				//System.out.print("\t"+mod[b]);
			}
			
	String info = "/home/hp/demo/finalcsv.csv";
	
	BufferedReader in = new BufferedReader (new FileReader(info));
       
	String[] result=null;
		     
		while((info = in.readLine())!=null)
		{

			result=info.split(",");
			//System.out.print("The String Array is: ");
			for(int x=0;x<result.length;x++)
			{
				if(m==10)
				{
					m=2;	
				}	
				//System.out.print(result[x]);	
				//System.out.print("\t");
				int array[] = new int[result.length];
				//System.out.print("The Integer Array is: ");
			
			 
				array[x] = Integer.parseInt(result[x]); 
				//System.out.print(array[x]);
				//System.out.print("\t");	
			
				//System.out.print("\n"); 
				diff[x]=input[x]-array[x];
				mul[x]=m*diff[x];
				
				m++;
		
				//System.out.print(mul[x]);

				//System.out.print("\t");

				
				

				//System.out.print(diff[x]);
				System.out.print("\t");
				
				

			}
				for(int d=0;d<8;d++)

				{

				add=add+mul[d];

				}			
				
				sum1[t]=add;
				t++;
				add=0;
	

				//System.out.print(add);								
				//System.out.print("sum1 is: \t"+sum1[3]);
			//System.out.print("\n");

		

		}
		//System.out.print("sum1 is: \t");


	for(int b=0;b<sum1.length;b++)
	{
	
	//System.out.print("\t"+sum1[b]);

	mod[b]=Math.abs(sum1[b]);
	//System.out.print("\t"+mod[b]);
	}	

	minvalue=mod[0];
	for(int v=1;v<mod.length;v++)
	{
		if(mod[v]<minvalue)
		{
			minvalue=mod[v];
			position=v;
		}

		
	}
	position1=position+1;
	System.out.println("\n");
	//System.out.println(position1);		


	if(position1>=1 && position1<=9)
	{
		System.out.println("The letter is Aa");
	}
         
	if(position1>=10 && position1<=18)
	{
		System.out.println("The letter is Ba");
	}         
	if(position1>=19 && position1<=27)
	{
		System.out.println("The letter is Ga");
	} 

	if(position1>=28 && position1<=36)
	{
		System.out.println("The letter is Ja");
	} 

	if(position1>=37 && position1<=45)
	{
		System.out.println("The letter is Kha");
	} 

	if(position1>=46 && position1<=54)
	{
		System.out.println("The letter is Ka");
	} 

	if(position1>=55 && position1<=63)
	{
		System.out.println("The letter is Uu");
	} 

	if(position1>=64 && position1<=72)
	{
		System.out.println("The letter is Sha");
	} 

	if(position1>=73 && position1<=81)
	{
		System.out.println("The letter is Sa");
	} 
	
	if(position1>=82 && position1<=90)
	{
		System.out.println("The letter is Ta");
	}
	if(position1>=91 && position1<=99)
	{
		System.out.println("The letter is Ala");
	}
	if(position1>=100 && position1<=108)
	{
		System.out.println("The letter is Dha");
	}
	if(position1>=109 && position1<=117)
	{
		System.out.println("The letter is Eya");
	}
	if(position1>=118 && position1<=126)
	{
		System.out.println("The letter is Fff");
	}
	if(position1>=127 && position1<=135)
	{
		System.out.println("The letter is Hhh");
	}
	if(position1>=136 && position1<=144)
	{
		System.out.println("The letter is Lll");
	}
	if(position1>=145 && position1<=153)
	{
		System.out.println("The letter is Nna");
	}
	if(position1>=154 && position1<=162)
	{
		System.out.println("The letter is Nnn");
		}
	if(position1>=163 && position1<=171)
	{
		System.out.println("The letter is Sha");
	}
	if(position1>=172 && position1<=180)
	{
		System.out.println("The letter is Vvv");
	}




						
			 
  }// main ends here
//#################################################################################################################################
  public static int check_boundarypt(int[][] a, int b, int c)// check core or boundary
  {
	cnt=0;
	  for(int i=(b-1);i<(b+2);i++)	
		{		
			for(int j=(c-1);j<(c+2);j++)
			{
				if(a[i][j]==1)
					{
					cnt++;
					}
			}
		}
		
	  if(cnt>7)
	  {
		  return 0;
			
	  }
	  else
              {

		  return 1;
  	      }		
  }
 
//#############################################################################################################################

public static int chaincode(int[][] a1, int i, int j)
  { 

	
		
	for(int k=0;k<=total;k++)
	{

       
		for(int x=0;x<3;x++)  //loop for [i-1]   loop runs 3 times because there are 2 neighbours (i-1,i,i+1)
		{
				
			if(a1[i-1][j-1]==1 && a1[i-1][j]==1)
			{
			a1[i-1][j-1]=5;
			}		
			if(a1[i-1][j]==1 && a1[i-1][j+1]==1)	
			{	
			a1[i-1][j]=4;
			}
			if(a1[i-1][j-1]==1 && a1[i-1][j+1]==1)	
			{	
			a1[i-1][j+1]=3;
			}
		
		}

		
		for(int x=0;x<3;x++)   //loop for [i+1]
		{
				
			if(a1[i+1][j-1]==1 && a1[i+1][j]==1)
			{
			a1[i+1][j-1]=7;
			}		
			if(a1[i+1][j]==1 && a1[i+1][j+1]==1)	
			{	
			a1[i+1][j]=8;
			}
			if(a1[i+1][j-1]==1 && a1[i+1][j+1]==1)	
			{	
			a1[i+1][j+1]=9;
			}
		
		}


		
		for(int x=0;x<3;x++)   //loop for [j-1]
		{
				
			if(a1[i-1][j-1]==1 && a1[i][j-1]==1)
			{
			a1[i-1][j-1]=5;
			}		
			if(a1[i][j-1]==1 && a1[i+1][j-1]==1)	
			{	
			a1[i][j-1]=6;
			}
			if(a1[i-1][j-1]==1 && a1[i+1][j-1]==1)	
			{	
			a1[i+1][j-1]=7;
			}
		
		}


		for(int x=0;x<3;x++)   //loop for [j+1]
		{
				
			if(a1[i-1][j+1]==1 && a1[i][j+1]==1)
			{
			a1[i-1][j+1]=3;
			}		
			if(a1[i][j+1]==1 && a1[i+1][j+1]==1)	
			{	
			a1[i][j+1]=2;
			}
			if(a1[i-1][j+1]==1 && a1[i+1][j+1]==1)	
			{	
			a1[i+1][j+1]=9;
			}
		
		}


		for(int x=0;x<3;x++)   //loop for [i]
		{
				
			while(a1[i][j-1]==1 && a1[i][j+1]==1)
			{
			a1[i][j+1]=2;
			}		
			
		
		}


		for(int x=0;x<3;x++)   //loop for [j]
		{
				
			while(a1[i-1][j]==1 && a1[i+1][j]==1)
			{
			a1[i+1][j]=8;
			}		
			
		
		}




//###############################################loop for checking conditions for combinations of 3 #################################################
		for(int x=0;x<3;x++)   
		{

			if(a1[i-1][j-1]==1 && a1[i-1][j]==1 && a1[i-1][j+1]==1)   //(5,4,3)
			{
			         a1[i-1][j]=4;
				
			}


			if(a1[i+1][j-1]==1 && a1[i+1][j]==1 && a1[i+1][j+1]==1)   //(7,8,9)
			{
			a1[i+1][j]=8;
			}

		

			if(a1[i-1][j-1]==1 && a1[i][j-1]==1 && a1[i+1][j-1]==1)   //(5,6,7)
			{
			a1[i][j-1]=6;
			}

	
			if(a1[i-1][j+1]==1 && a1[i][j+1]==1 && a1[i+1][j+1]==1)   //(3,2,9)
			{
			a1[i][j+1]=2;
			}


			if(a1[i-1][j]==1 && a1[i-1][j+1]==1 && a1[i][j+1]==1)   //(4,3,2)
			{
			a1[i-1][j+1]=3;
			}

	
			if(a1[i][j+1]==1 && a1[i+1][j+1]==1 && a1[i+1][j]==1)   //(2,9,8)
			{
			a1[i+1][j+1]=9;
			}

	
			if(a1[i+1][j]==1 && a1[i+1][j-1]==1 && a1[i][j-1]==1)   //(8,7,6)
			{
			a1[i+1][j-1]=7;
			}

	
			if(a1[i][j-1]==1 && a1[i-1][j-1]==1 && a1[i-1][j]==1)   //(6,5,4)
			{
			a1[i-1][j-1]=5;
			}
		
			//######################################################

			if(a1[i-1][j-1]==1 && a1[i-1][j]==1 && a1[i][j+1]==1)   //(5,4,2)
			{
			         a1[i][j+1]=2;
				
			}

			if(a1[i-1][j-1]==1 && a1[i-1][j]==1 && a1[i+1][j+1]==1)   //(5,4,9)
			{
			         a1[i+1][j+1]=9;
				
			}
			
			if(a1[i-1][j-1]==1 && a1[i-1][j]==1 && a1[i+1][j]==1)   //(5,4,8)
			{
			         a1[i+1][j]=8;
				
			}


			if(a1[i-1][j-1]==1 && a1[i-1][j]==1 && a1[i+1][j-1]==1)   //(5,4,7)
			{
			         a1[i+1][j-1]=7;
				
			}
			
			//#######################################3
			if(a1[i+1][j-1]==1 && a1[i+1][j]==1 && a1[i][j+1]==1)   //(7,8,2)
			{
			a1[i][j+1]=2;
			}

			if(a1[i+1][j-1]==1 && a1[i+1][j]==1 && a1[i-1][j+1]==1)   //(7,8,3)
			{
			a1[i-1][j+1]=3;
			}

			if(a1[i+1][j-1]==1 && a1[i+1][j]==1 && a1[i-1][j]==1)   //(7,8,4)
			{
			a1[i-1][j]=4;
			}

			if(a1[i+1][j-1]==1 && a1[i+1][j]==1 && a1[i-1][j-1]==1)   //(7,8,5)
			{
			a1[i-1][j-1]=5;
			}
			
			//#########################################

			if(a1[i-1][j-1]==1 && a1[i][j-1]==1 && a1[i-1][j+1]==1)   //(5,6,3)
			{
			a1[i-1][j+1]=3;
			}
			
			if(a1[i-1][j-1]==1 && a1[i][j-1]==1 && a1[i][j+1]==1)   //(5,6,2)
			{
			a1[i][j+1]=2;
			}

			if(a1[i-1][j-1]==1 && a1[i][j-1]==1 && a1[i+1][j+1]==1)   //(5,6,9)
			{
			a1[i+1][j+1]=9;
			}

			if(a1[i-1][j-1]==1 && a1[i][j-1]==1 && a1[i+1][j]==1)   //(5,6,8)
			{
			a1[i+1][j]=8;
			}
		
			//##########################################

			if(a1[i-1][j+1]==1 && a1[i][j+1]==1 && a1[i+1][j]==1)   //(3,2,8)
			{
			a1[i+1][j]=8;
			}

			if(a1[i-1][j+1]==1 && a1[i][j+1]==1 && a1[i+1][j-1]==1)   //(3,2,7)
			{
			a1[i+1][j-1]=7;
			}

			if(a1[i-1][j+1]==1 && a1[i][j+1]==1 && a1[i][j-1]==1)   //(3,2,6)
			{
			a1[i][j-1]=6;
			}

			if(a1[i-1][j+1]==1 && a1[i][j+1]==1 && a1[i-1][j-1]==1)   //(3,2,5)
			{
			a1[i-1][j-1]=5;
			}
			//#############################################


			if(a1[i-1][j]==1 && a1[i][j-1]==1 && a1[i][j+1]==1)   //(4,6,2)
			{
			a1[i-1][j]=4;
			}

			if(a1[i+1][j-1]==1 && a1[i][j-1]==1 && a1[i][j+1]==1)   //(7,6,2)
			{
			a1[i+1][j-1]=7;
			}	
		
			if(a1[i+1][j]==1 && a1[i][j-1]==1 && a1[i][j+1]==1)   //(8,6,2)
			{
			a1[i+1][j]=8;
			}

			if(a1[i+1][j+1]==1 && a1[i][j-1]==1 && a1[i][j+1]==1)   //(9,6,2)
			{
			a1[i+1][j+1]=9;
			}
		
			//#############################################

			if(a1[i][j-1]==1 && a1[i+1][j]==1 && a1[i-1][j]==1)   //(6,8,4)
			{
			a1[i][j-1]=6;
			}

			if(a1[i-1][j+1]==1 && a1[i+1][j]==1 && a1[i-1][j]==1)   //(3,8,4)
			{
			a1[i-1][j+1]=3;
			}

			if(a1[i][j+1]==1 && a1[i+1][j]==1 && a1[i-1][j]==1)   //(2,8,4)
			{
			a1[i][j+1]=2;
			}

			if(a1[i+1][j+1]==1 && a1[i+1][j]==1 && a1[i-1][j]==1)   //(9,8,4)
			{
			a1[i+1][j+1]=9;
			}
			
			//##############################################

			if(a1[i-1][j]==1 && a1[i-1][j+1]==1 && a1[i+1][j+1]==1)   //(4,3,9)
			{
			a1[i+1][j+1]=9;
			}

			if(a1[i-1][j]==1 && a1[i-1][j+1]==1 && a1[i+1][j-1]==1)   //(4,3,7)
			{
			a1[i+1][j-1]=7;
			}

			if(a1[i-1][j]==1 && a1[i-1][j+1]==1 && a1[i][j-1]==1)   //(4,3,6)
			{
			a1[i][j-1]=6;
			}

			//###############################################

			if(a1[i+1][j+1]==1 && a1[i+1][j]==1 && a1[i-1][j+1]==1)   //(9,8,3)
			{
			a1[i-1][j+1]=3;
			}

			if(a1[i+1][j+1]==1 && a1[i+1][j]==1 && a1[i-1][j-1]==1)   //(9,8,5)
			{
			a1[i-1][j-1]=5;
			}

			if(a1[i+1][j+1]==1 && a1[i+1][j]==1 && a1[i][j-1]==1)   //(9,8,6)
			{
			a1[i][j-1]=6;
			}

			//#############################################

			if(a1[i+1][j+1]==1 && a1[i][j-1]==1 && a1[i+1][j-1]==1)   //(9,6,7)
			{
			a1[i+1][j+1]=9;
			}

			if(a1[i-1][j+1]==1 && a1[i][j-1]==1 && a1[i+1][j-1]==1)   //(3,6,7)
			{
			a1[i-1][j+1]=3;
			}

			if(a1[i-1][j]==1 && a1[i][j-1]==1 && a1[i+1][j-1]==1)   //(4,6,7)
			{
			a1[i-1][j]=4;
			}

			//################################################

			if(a1[i][j+1]==1 && a1[i+1][j+1]==1 && a1[i+1][j-1]==1)   //(2,9,7)
			{
			a1[i+1][j-1]=7;
			}

			if(a1[i][j+1]==1 && a1[i+1][j+1]==1 && a1[i-1][j-1]==1)   //(2,9,5)
			{
			a1[i-1][j-1]=5;
			}

			if(a1[i][j+1]==1 && a1[i+1][j+1]==1 && a1[i-1][j]==1)   //(2,9,4)
			{
			a1[i-1][j]=4;
			}
			
			//###############################################

			if(a1[i-1][j-1]==1 && a1[i+1][j+1]==1 && a1[i-1][j+1]==1)   //(5,9,3)
			{
			         a1[i+1][j+1]=9;
				
			}

			if(a1[i-1][j-1]==1 && a1[i+1][j]==1 && a1[i-1][j+1]==1)   //(5,8,3)
			{
			         a1[i+1][j]=8;
				
			}

			if(a1[i-1][j-1]==1 && a1[i+1][j-1]==1 && a1[i-1][j+1]==1)   //(5,7,3)
			{
			         a1[i+1][j-1]=7;
				
			}

			//#################################################

			if(a1[i-1][j-1]==1 && a1[i+1][j+1]==1 && a1[i+1][j-1]==1)   //(5,9,7)
			{
			a1[i-1][j-1]=5;
			}

			if(a1[i-1][j]==1 && a1[i+1][j+1]==1 && a1[i+1][j-1]==1)   //(4,9,7)
			{
			a1[i-1][j]=4;
			}

			if(a1[i-1][j+1]==1 && a1[i+1][j+1]==1 && a1[i+1][j-1]==1)   //(3,9,7)
			{
			a1[i-1][j+1]=3;
			}

			//################################################

			if(a1[i-1][j-1]==1 && a1[i][j+1]==1 && a1[i+1][j-1]==1)   //(5,2,7)
			{
			         a1[i][j+1]=2;
				
			}

			if(a1[i-1][j-1]==1 && a1[i+1][j+1]==1 && a1[i+1][j-1]==1)   //(5,9,7)
			{
			         a1[i+1][j+1]=9;
				
			}

			if(a1[i-1][j-1]==1 && a1[i+1][j]==1 && a1[i+1][j-1]==1)   //(5,8,7)
			{
			         a1[i+1][j]=8;
				
			}	
				
			//###############################################
			
			if(a1[i+1][j-1]==1 && a1[i-1][j+1]==1 && a1[i+1][j+1]==1)   //(7,3,9)
			{
			a1[i+1][j-1]=7;
			}

			if(a1[i][j-1]==1 && a1[i-1][j+1]==1 && a1[i+1][j+1]==1)   //(6,3,9)
			{
			a1[i][j-1]=6;
			}

			if(a1[i-1][j-1]==1 && a1[i-1][j+1]==1 && a1[i+1][j+1]==1)   //(5,3,9)
			{
			a1[i-1][j-1]=5;
			}
			
		}// for to check combinations of 3 ends here




	}// main for loop ends here


	for(int e=0;e<=114;e++)
	{

		for(int f=0;f<=114;f++)
		{
			
				if(a1[i-1][j-1]==1)
				{
					a1[i-1][j-1]=5;
				}
				
				if(a1[i-1][j]==1)
				{
					a1[i-1][j]=4;
				}

				if(a1[i-1][j+1]==1)
				{
					a1[i-1][j+1]=3;
				}

				if(a1[i][j+1]==1)
				{
					a1[i][j+1]=2;
				}

				if(a1[i+1][j+1]==1)
				{
					a1[i+1][j+1]=9;
				}

				if(a1[i+1][j]==1)
				{
					a1[i+1][j]=8;
				}

				if(a1[i+1][j-1]==1)
				{
					a1[i+1][j-1]=7;
				}

				if(a1[i][j-1]==1)
				{
					a1[i][j-1]=6;
				}


			
		
		}

	}	




//#########################################remaining 1s#########################

//get image width and height


  for(int u=1;u<=114;u++)	
   {		
	for(int v=1;v<=114;v++)
	{
		if(a1[i][j]==1)
		{
			if(a1[i-1][j+1]==3)
			{
				a1[i][j]=7;
			}

			if(a1[i][j+1]==2)
			{
				a1[i][j]=6;
			}

			if(a1[i+1][j+1]==9)
			{
				a1[i][j]=5;
			}

			if(a1[i+1][j]==4)
			{
				a1[i][j]=8;
			}

			if(a1[i+1][j-1]==7)
			{
				a1[i][j]=3;
			}

			if(a1[i][j-1]==6)
			{
				a1[i][j]=2;
			}

			if(a1[i-1][j-1]==5)
			{
				a1[i][j]=9;
			}

			if(a1[i-1][j]==8)
			{
				a1[i][j]=4;
			}
			
						

		
				
	}//main if ends

	
		
    }//for ends  
	
}//for ends	


	return 1;
	}//chaincode() ends here
	





	}//class ends here


