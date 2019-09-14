package matematicas;

public class Matematicas implements MathArray{

	@Override
	public int min(int[] array_num) {
		int min = array_num[0];
		for (int i = 1; i < array_num.length; i++) {
			if (array_num[i] < array_num[i - 1]) {
				min = array_num[i];
			}
		}
		return min;
	}

	@Override
	public int max(int[] array_num) {
		int max = array_num[0];
		for (int i = 1; i < array_num.length; i++) {
			if (array_num[i] > array_num[i - 1]) {
				max = array_num[i];
			}
		}
		return max;
	}

	@Override
	public int sum(int[] array_num) {
		int sum = array_num[0];
		for (int i = 1; i < array_num.length; i++) {
			sum += array_num[i];
		}
		return sum;
	}

	@Override
	public double min(double[] array_num) {
		double min = array_num[0];
		for (int i = 1; i < array_num.length; i++) {
			if (array_num[i] < array_num[i - 1]) {
				min = array_num[i];
			}
		}
		return min;
	}

	@Override
	public double max(double[] array_num) {
		double max = array_num[0];
		for (int i = 1; i < array_num.length; i++) {
			if (array_num[i] > array_num[i - 1]) {
				max = array_num[i];
			}
		}
		return max;
	}

	@Override
	public double sum(double[] array_num) {
		double sum = array_num[0];
		for (int i = 1; i < array_num.length; i++) {
			sum += array_num[i];
		}
		return sum;
	}
	
	public int factorial(int n) {
		int factorial = 1;
		if (n == 0) {
			return factorial;
		}
		for (int i = 1; i < n; i++) {
			factorial *= i;
		}
		return factorial;
	}
	
	public int random(int min, int max) {
		return (int) (Math.random() * (max - min + 1)) + min;
	}

}
