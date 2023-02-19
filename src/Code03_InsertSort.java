public class Code03_InsertSort {
    public static void insertSort1(int[] arr) {
		if (arr == null || arr.length < 2) { // 排除边界条件
			return;
		}
		// insert sort
		int N = arr.length; // 获取字符串长度
		for (int end= 1; end < N; end++) { //想象你在玩斗地主，前面的牌都理好了，是有序的，刚摸了一张牌，此时这张牌在end位置，该行代码规定了下面的循环应在0~end位置运行；
			                                                           //为什么从1开始？因为 0 ~ 0 位置肯定是有序的，比方说刚模了一张牌，怎么都是有序的；
			int newNumIndex = end; //定义位置变量newNumIndex，新的数先来到end位置
			while (newNumIndex  -1 >= 0 && arr[newNumIndex  -1] > arr[newNumIndex]) { //当左边有数且自身没有左边的数大时，交换
				swap(arr, newNumIndex - 1, newNumIndex);
				newNumIndex--; //交换完之后新的数来到end-1位置，往左移动
			}
		}
	}
	
	public static void insertSort2(int[] arr) {
		if (arr == null || arr.length < 2) { // 排除边界条件
			return;
		}
		// insert sort
		int N = arr.length; // 获取字符串长度
		for (int end = 1; end < N; end++) {
			// pre
			for (int pre = end - 1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--) {
				swap(arr, pre, pre + 1);
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
		//insertSort1(arr);
		insertSort2(arr);
		printArray(arr);

	}
}
