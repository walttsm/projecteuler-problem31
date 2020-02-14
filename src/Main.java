
public class Main {

	public static void main(String[] args) {
		int total = 200;
		int sum=0;
		int count=0;
		//values = [1, 2, 5, 10, 20, 50, 100, 200]
		
		/*total - sum = 0;
		 * sum = a * 200 +  b * 100 + c * 50 + d * 20 + e * 10 + f * 5 + g * 2 + h *1;
		 * max_a = 1, max_b = 2, max_c = 4, max_d = 10, max_e = 20, max_f = 40, max_g = 100, max_h = 200;
		*/
		
		for (int a = 0; a <= 1; a++) {
			for (int b = 0; b <= 2; b++) {
				for (int c = 0; c<= 4; c++) {
					for (int d = 0; d <= 10; d++) {
						for (int e = 0; e <= 20; e++) {
							for (int f = 0; f <= 40; f++) {
								for (int g = 0; g <= 100; g++) {
									for (int h = 0; h <= 200; h++) {
										sum = a * 200 +  b * 100 + c * 50 + d * 20 + e * 10 + f * 5 + g * 2 + h *1;
										if (sum == 200) {
											count++;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.printf("There are %d possibilities", count);
	}
}
