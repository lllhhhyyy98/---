public class Code01_SlectionSort {
    // 题目
	// 0 ~ N-1 上选最小数放到0
	// 1 ~ N-1 上选最小数放到1
	// ......
    public static void selectSort(int[] arr) {
		if (arr == null || arr.length < 2) { // 排除边界条件
			return;
		}
		// 选择排序开始
		int N = arr.length; // 获取字符串长度
		for (int i = 0; i < N; i++) { // for循环遍历整个字符串，0 ~ N -1， 1 ~ N-1, ......, i ~ N -1，想象一个光标依次移动
			int minValueIndex = i; //如果我们刚看到i位置， 假设 i 位置是当前 i~ N - 1中最小值， 定义minValueIndex变量
			for (int j = i + 1; j < N; j++) { //遍历i位置后所有的数
				minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex; // 最小值的位置要不要更新？和之前发现的最小值的位置比较
			}
			swap(arr, i, minValueIndex);
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
		selectSort(arr);
		printArray(arr);

	}
}
