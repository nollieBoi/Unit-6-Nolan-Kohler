import java.util.Scanner;

public class FrequencyChart {
    //class stuff

    //instance variables

    private int[] beans;
    //constructor
    public FrequencyChart(int[] bean){
        this.beans = bean;
    }

    //method
    public String makeChart(){

    }

    //helper methods

    //end class stuff

    //main method to make the chart
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("How many values in your data set?");
        int size = scan.nextInt();

        int[] data = new int[size];

        System.out.println("Enter data value one at a time, followed by enter:");
        int val = 0;

        for(int i = 0; i < data.length; i++){
            val = scan.nextInt();
            data[i] = val;
        }

        FrequencyChart chart = new FrequencyChart(data);

        System.out.println(chart.makeChart());
    }
}
