package kadai_004;

public class Score_Chapter04 {

	public static void main(String[] args) {
		
		String[] nameArray = {"A","B","C","D","E","F","G","H","I","J"};
		int[] scoreArray = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.println(nameArray[0] + "さんの点数は" + scoreArray[0] +"点");
		System.out.println(nameArray[1] + "さんの点数は" + scoreArray[1] +"点");
		System.out.println(nameArray[2] + "さんの点数は" + scoreArray[2] +"点");
		System.out.println(nameArray[3] + "さんの点数は" + scoreArray[3] +"点");
		System.out.println(nameArray[4] + "さんの点数は" + scoreArray[4] +"点");
		System.out.println(nameArray[5] + "さんの点数は" + scoreArray[5] +"点");
		System.out.println(nameArray[6] + "さんの点数は" + scoreArray[6] +"点");
		System.out.println(nameArray[7] + "さんの点数は" + scoreArray[7] +"点");
		System.out.println(nameArray[8] + "さんの点数は" + scoreArray[8] +"点");
		System.out.println(nameArray[9] + "さんの点数は" + scoreArray[9] +"点");
//		2つの配列の値をfor文で1つずつ取り出して出力したかったのですが現状の知識ではうまくいかなかったです。
		
		int sum =0;
		int average =0;
		
		for(int i = 0; i < scoreArray.length; i++) {
			sum += scoreArray[i];
//			System.out.println(sum);
		}
		
		average = sum / scoreArray.length;
		System.out.println("テストの平均点は" + average + "点");
	}
}
