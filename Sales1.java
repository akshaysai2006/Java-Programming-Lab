public class Sales1 {
    public static void main(String[] args) {
        int[] sales = {12000,15000,18000,10000,22000,17000,25000,14000,19000,21000,16000,13000};

        int max = sales[0];
        int min = sales[0];

        for(int i=1;i<sales.length;i++){
            if(sales[i]>max)
                max=sales[i];
            if(sales[i]<min)
                min=sales[i];
        }

        System.out.println("Highest Sales = " + max);
        System.out.println("Lowest Sales = " + min);
    }
}