public class Code02_BubbleSort {
    public static void bubbleSort(int[] arr) {
		if (arr == null || arr.length < 2) { // 排除边界条件
			return;
		}
		// bubble sort
		int N = arr.length; // 获取字符串长度
		for (int end = N - 1; end >= 0; end--) { // 管理0 到 哪个位置上do something (0  - N-1 位置；0 - N-2 位置 ......)
			for (int second = 1; second <= end; second++) { // 描述0 ~ end干了什么
				if (arr[second - 1] > arr[second]) {// 1和2要不要换， 2和3要不要换......end-1和end要不要换
					swap(arr, second - 1, second);
					}
				}

		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;
	}
 
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

	}

	public static void main(String[] args) {
		int[] arr = { 7, 1, 3, 5, 1, 6, 8, 1, 3, 5, 7, 5, 6 };
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);

	}
    
}
