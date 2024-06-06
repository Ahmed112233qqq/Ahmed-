package matrixes;
import java.util.Scanner;
public class students_marks_sum_average {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
          Scanner mm=new Scanner(System.in);
        String[]name=new String [4];
        String[]name2=new String[4];
        int []sum=new int [4];
        int []a=new int [4];
        int []b=new int [4];
        double []average=new double [4];
            int [][]marks=new int [4][5];
            int [][]marks2=new int [4][5];
        
        for(int i=0;i<4;i++){
            System.out.println("enter name of student"+(i+1));
            name[i]=mm.nextLine();
            for(int j=0;j<5;j++){
                System.out.println("enter mark of subject "+(j+1));
                marks[i][j]=in.nextInt();}}
        
        
            for(int i=0;i<4;i++){
                for(int j=0;j<5;j++)
                sum[i]=marks[i][j]+sum[i];
                average[i]=sum[i]/5.0;
                
                
            }for(int i=0;i<4;i++){
                a[i]=sum[i];}
        
        int t;
        for(int i=0;i<sum.length;i++){
            for(int j=i+1;j<sum.length;j++){
                if(sum[i]<sum[j])
                {  t=sum[i];
                    sum[i]=sum[j];
                    sum[j]=t;
            }}}
        
        double s;
            for(int i=0;i<average.length;i++){
                for(int j=i+1;j<average.length;j++){
                    if(average[i]<average[j]){
                        s=average[i];
                    average[i]=average[j];
                    average[j]=s;}}}
                  System.out.println();
                  System.out.println();
        
        for(int i=0;i<name.length;i++)
        name2[i]=name[b[i]];
        
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++)
            if(sum[i]==a[j])
                b[i]=j;}
        
          for(int i=0;i<name.length;i++)
        name2[i]=name[b[i]];
        
        
        System.out.println();
        System.out.println("________________________________");
        System.out.println("NAME    SUM    AVERAGE");
        for(int i=0;i<sum.length;i++)
          System.out.println(name2[i]+"    "+sum[i]+"   %"+average[i]);
        
} }