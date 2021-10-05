public class InsertSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void insertSort(double[] list){
        int j;
        for (int i = 1; i < list.length; i++) {
            double key=list[i];
            j=i-1;
            while (j>=0&&list[j]>key){
                list[j+1]=list[j];
                j--;
            }
            list[j+1]=key;
        }
    }
    public static void main(String[] args) {
        insertSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
