
public class q10 {

	static int getDigitCount(int n) {
        int count = 0;
        while (true) {
            if (n == 0) {
                break;
            }
            n = n / 10;  // ���� n�� 10���� ������ �� ���� �ٽ� ���� n�� �����Ѵ�.
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(3));  // 1 ���
        System.out.println(getDigitCount(25));  // 2 ���
        System.out.println(getDigitCount(135));  // 3 ���
        System.out.println(getDigitCount(1314));  // 4 ���
    }

}
