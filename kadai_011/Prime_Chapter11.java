package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		
//		1～100までの数字が素数かどうかを判定する配列を作成。
		boolean[] isPrimeNumber = new boolean[101];
		
//		課題の作業手順Step2に従い、配列の初期値をtrueにする。
		for(int j = 0; j<isPrimeNumber.length; j++) {
			isPrimeNumber[j] = true;
		}
		
//		割られる数iを2～100まで繰り返し処理。
		for(int i = 2; i < isPrimeNumber.length; i++) {
//			割る数kが2～割られる数iになるまで素数判定をする。
			for(int k = 2; k < i; k++) {
				if(i%k==0) {
					isPrimeNumber[i-1]=false;
				}
			}
		}
//		素数の出力。
		for(int r = 1; r < 100; r++) {
			if(isPrimeNumber[r] == true) {
				System.out.println(r+1);
			}
		}
	}
}
