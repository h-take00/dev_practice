package ransuApl.Service;

import java.util.ArrayList;
import java.util.Random;

/**
 * 乱数処理サービス
 * @author hironori
 *
 */

public class ransuService{

	public static void main(String[] args) {
	/**
	 * 定義の設定
	 * /
		/**メンバーリスト*/
		ArrayList<String>memberList = new ArrayList<String>();
		/**試合者リスト*/
		ArrayList<String>matchList = new ArrayList<String>(); 
		/***/
		/**参加者数*/
		String member = args[0];
		int memverCount = Integer.parseInt(member);
		/**コート数*/
		String coat = args[1];
		int coatGroup = Integer.parseInt(coat);
				
	/**
	 * 処理開始
	 */
		/*1.メンバーリストを作成する*/
		for(int x=1; x <= memverCount;x++) {
			memberList.add(String.valueOf(x));
		}
		System.out.println("メンバーリストの内容："+memberList);
		
		/*2.メンバーリストの内容を試合者リストに設定する*/
			/**メンバーリストのサイズを取得*/
			int size = memberList.size();
			System.out.println("メンバーリストのサイズ："+size);
			/**乱数設定*/
			Random rndGroup = new Random(coatGroup);
			
			for(int y=0;y <size;y++) {
			int intValue = rndGroup.nextInt(coatGroup);
			System.out.println(intValue);
			}			
			
		
		System.out.println(matchList);

		
	}
}
