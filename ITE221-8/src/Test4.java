
public class Test4 {
    public static void main(String[] args) {
    	mostFrequentDigit(0);
    	System.out.println();
    }
		public static int mostFrequentDigit(int n) {
			int[] counts = new int[10];
			while(n > 0) {
				int digit = n % 10;
				counts[digit]++;
				n = n / 10;
			}
			int bestIndex = 0;
			for(int i = 1; i < counts.length; i++) {
				if(counts[i] > counts[bestIndex]) {
					bestIndex = i;
				}
			}
			return bestIndex;
		}
}
