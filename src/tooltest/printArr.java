package tooltest;

public class printArr {
    public static void printAr(int[] arr) {//
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void getaverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("平均数是：" + sum / arr.length);
    }

    private printArr() {//私有构造函数是为了不让其创建实例对象
    }

}
