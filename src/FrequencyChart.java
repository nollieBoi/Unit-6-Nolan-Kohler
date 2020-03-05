import java.util.Scanner;

public class FrequencyChart {

    private int[] list;

    public FrequencyChart(int[] list){
        this.list = list;
    }

    public String makeChart(){
        String result = "";

        String line0 = "";
        String line1 = "";
        String line2 = "";
        String line3 = "";
        String line4 = "";
        String line5 = "";
        String line6 = "";
        String line7 = "";
        String line8 = "";
        String line9 = "";

        for(int i : list){
            if(i >= 1 && i <= 10)
                line0 += "*";
            if(i >= 11 && i <= 20)
                line1 += "*";
            if(i >= 21 && i <= 30)
                line2 += "*";
            if(i >= 31 && i <= 40)
                line3 += "*";
            if(i >= 41 && i <= 50)
                line4 += "*";
            if(i >= 51 && i <= 60)
                line5 += "*";
            if(i >= 61 && i <= 70)
                line6 += "*";
            if(i >= 71 && i <= 80)
                line7 += "*";
            if(i >= 81 && i <= 90)
                line8 += "*";
            if(i >= 91 && i <= 100)
                line9 += "*";


        }
        result += "1-10   | " + line0 +"\n";
        result += "11-20  | " + line1 +"\n";
        result += "21-30  | " + line2 +"\n";
        result += "31-40  | " + line3 +"\n";
        result += "41-50  | " + line4 +"\n";
        result += "51-60  | " + line5 +"\n";
        result += "61-70  | " + line6 +"\n";
        result += "71-80  | " + line7 +"\n";
        result += "81-90  | " + line8 +"\n";
        result += "91-100 | " + line9 +"\n";

        return result;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of values in data set");
        int size = scan.nextInt();

        int[] data = new int[size];

        System.out.println("Enter data value and press ENTER one at a time");
        int val = 0;
        for(int i = 0; i < data.length; i++){
            val = scan.nextInt();
            data[i] = val;
        }

        FrequencyChart chart = new FrequencyChart(data);

        System.out.println(chart.makeChart());
    }
}