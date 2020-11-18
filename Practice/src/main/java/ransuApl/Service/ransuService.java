package ransuApl.Service;

import java.util.ArrayList;
import java.util.List;
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
		 */
			/*メンバーリスト*/
			ArrayList<String>memberList = new ArrayList<String>();
			/*参加者数*/
			int memberCount = Integer.parseInt(args[0]);
			/*コート数*/
			int coatGroup = Integer.parseInt(args[1]);
			/*試合者リスト*/
			List<String>matchList = new ArrayList<>();
			/*試合数*/
			int gameCount = Integer.parseInt(args[2]);
				
	/**
	 * 処理開始
	 */
		/*1.メンバーリストを作成する*/
		memberListCreate(memberList,memberCount);
		System.out.println("メンバーリストの内容："+memberList);
		
		/*2.メンバーリストの内容を試合者リストに設定する*/
			//メンバーリストのサイズを取得
			int size = memberList.size();
			System.out.println("メンバーリストのサイズ："+size);
			
			//for文で回す
			//乱数設定(コートグループの採番)
			
			
			//if文で対象のコートグループが割り当て済みならbreakする。
			for(int y=0;y <size;y++) {
				Random rndGroup = new Random(coatGroup);	
				int intValue = rndGroup.nextInt(coatGroup);
				matchList.add(Integer.toString(intValue));
				matchList.add(Integer.toString(y));
			
			System.out.println(matchList);
			}			
			
		
		System.out.println(matchList);

		
	}
	
	/*
	 *以下部品 
	 *
	 */
		
	/**
	 * 
	 * @param memberList
	 * @param memberCount
	 */
	public static void memberListCreate(ArrayList<String> memberList,int memberCount){
		for(int x=1; x <= memberCount;x++) {
			memberList.add(String.valueOf(x));
		}
	}
}
