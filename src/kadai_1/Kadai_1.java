package kadai_1;

public class Kadai_1 {

	public static void main(String[] args) {

		/*1から100までの整数の繰り返し*/
		for(int i = 1; i <  101; i++){
			System.out.println(henkan(i));/*henkanメソッドの結果を画面出力*/
		}

	}

	/*3の倍数及び4の倍数の数字を文字に変換するメソッド*/
	public static String henkan(int i){

		/*入力が3と4の公倍数であれば◆を返す*/
		if(sanNoBaisu(i) && yonNoBaisu(i))
			return "◆";

		/*入力が3の倍数であれば△を返す*/
		else if(sanNoBaisu(i))
			return "△";

		/*入力が4の倍数であれば□を返す*/
		else if(yonNoBaisu(i))
			return "□";

		/*入力が3の倍数でも4の倍数でもなければ入力の数字を文字列としてそのまま返す*/
		else
			return String.valueOf(i) ;
	}

	/*数字が3の倍数か判断するメソッド*/
	public static boolean sanNoBaisu(int i){

		if(i%3 == 0)
			return true;
		else
			return false;

	}

	/*数字が4の倍数か判断するメソッド*/
	public static boolean yonNoBaisu(int i){

		if(i%4 == 0)
			return true;
		else
			return false;

	}
}
