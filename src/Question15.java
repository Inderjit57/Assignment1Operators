
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Maths = 75;
		int Science = 55;
		int operatingSystems = 80;
		int datawareHouse = 75;
		char percent = '%';

		int sum = Maths + Science + operatingSystems + datawareHouse;
		float totalPercentage = (sum * 100) / 400;

		System.out.println(sum);
		System.out.println("Total Percentage got : " + totalPercentage + percent);

	}

}
