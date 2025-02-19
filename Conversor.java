
public class Conversor {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] sortedArray = sortArrayByParity(nums);
        System.out.println("Array ordenado por paridade:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortArrayByParity(int[] nums) {
        int oddCount = 0;
        int evenCount = 0;

        // Contar o número de números ímpares e pares
        for (int num : nums) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Criar dois arrays para os números pares e ímpares
        int[] evenNums = new int[evenCount];
        int[] oddNums = new int[oddCount];
        int evenIndex = 0, oddIndex = 0;

        // Preencher os arrays com números pares e ímpares
        for (int num : nums) {
            if (num % 2 == 0) {
                evenNums[evenIndex++] = num;
            } else {
                oddNums[oddIndex++] = num;
            }
        }

        // Mesclar os números pares e ímpares em um único array
        int[] sortedArray = new int[nums.length];
        System.arraycopy(evenNums, 0, sortedArray, 0, evenNums.length);
        System.arraycopy(oddNums, 0, sortedArray, evenNums.length, oddNums.length);

        return sortedArray;
    }
}
