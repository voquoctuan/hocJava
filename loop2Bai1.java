public class loop2Bai1 {
    public static void main(String[] args) {
        System.out.println("Cac so chia het cho 7 nhung khong phai boi so cua 5: ");
        for (int i = 10; i<=200; i++) {
            if(i % 7== 0 && i %5!=0) {
                System.out.print(i + " ");
            }
        }
    }
}
