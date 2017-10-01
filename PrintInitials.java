import java.util.Scanner;
import java.util.Arrays;
public class PrintInitials {
    public static void main(String[] args) {
        System.out.println("Enter initials:");
        Scanner sc=new Scanner(System.in);
		int row=9;
        String str=sc.nextLine();
		char[] ch=str.toUpperCase().toCharArray();
		int ch1[]=new int[str.length()];
		for(int j=0;j<str.length();j++){
		ch1[j]=(int) ch[j];
		}
		for(int k=0;k<str.length();k++)
		{
			switch(ch1[k])
			{
			case 65:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(j==0||j==8||i==0||i==4){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 66:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(j==0||j==8||i==0||i==4||i==8){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 67:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(j==0||i==0||i==8){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 68:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(j==2||j==8||i==0||i==8){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 69:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(j==0||i==0||i==4||i==8){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 70:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(j==0||i==0||i==4){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 71:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(j==0||i==0||(i==8&&j<row/2+1)||(i>row/2-1 && j==row/2)||(i>row/2-1 && j==8)||(i==4&&j>row/2)){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 72:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(j==0||i==4||j==8){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 73:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(i==0||i==8||j==4){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 74:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(i==0||j==4||(i>row/2&&j==0)||(i==8&&j<row/2)){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 75:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if((i==j&&i>row/2-1)||(i+j==row-1&&j>row/2-1)||j==3){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 76:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(j==0||i==8){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 77:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(j==0||j==8||(i==j || i+j==row-1) && i<row/2+1){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 78:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(j==0||j==8||i==j){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 79:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(i==0||i==8||j==0||j==8){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			
			case 80:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(j==0||i==0||i==4||(i<=row/2&&j==8)){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 81:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if((j==0&&i<8)||(i==0&&j<8)||(j==7&&i<7)||(i==7&&j<8)||(i==j&&i>row/2&&j>row/2)){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 82:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(j==0||i==0||i==4||(i<=row/2&&j==8)||(i==j&&i>row/2&&j>row/2)){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 83:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(i==0||i==8||i==4||(j==0&&i<row/2)||(j==8&&i>row/2)){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 84:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(i==0||j==4){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 85:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(i==8||j==0||j==8){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 86:
			for(int i=0;i<row;i++){
				for(int j=0;j<row*2;j++){
					if(i==j||i+j==row*2-1){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 87:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(j==0||j==8||(i==j&&i>row/2-1&&j>row/2-1)||(i+j==row-1&&i>row/2&&j<row/2)){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 88:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(i==j || i+j==row-1){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 89:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(((i==j || i+j==row-1) && i<row/2+1) || (i>row/2 && j==row/2)){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			case 90:
			for(int i=0;i<row;i++){
				for(int j=0;j<row;j++){
					if(i==0 || i+j==row-1 || i==row-1){
						System.out.print("*");
					} else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println();
			break;
			}
		}
	}
}
