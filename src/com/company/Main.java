package com.company;

public class Main {

    public static void main(String[] args) {
	int month = 3;
	if (month<3|month>11)
	{
	    System.out.println("Зима");
    }
	else if(month>2&month<6)
        {
            System.out.println("Весна");
        }
	else if(month>5&month<9)
        {
            System.out.println("Лето");
        }
	else
	    {
            System.out.println("Осень");
        }
	int[] array={1,2,4,21,342,1,23,42,12,34};
	for(int i=9;i>=0;i--)
	{
	    System.out.print(array[i]+" ");
    }
	System.out.println();
	int[][] squareArray= new int[2][2];
	squareArray[0][0]=12;
	squareArray[0][1]=16;
	squareArray[1][0]=22;
	squareArray[1][1]=93;
        int a=0;
        int i=0;
        for(a=0;a<=1;a++){
        for(i=0;i<=1;i++){
        System.out.print(squareArray[i][a]+" " +"["+i+"]"+"["+a+"] ");
        i++;
            System.out.println(squareArray[i][a]+" " +"["+i+"]"+"["+a+"]");

        }
          if(a>1){break;}
    }
    }
}
