package nivel1;

import java.util.ArrayList;

public class UndoSingleton {
	
	private static UndoSingleton MyInstance;
	private ArrayList<String> list;
	
	public static UndoSingleton getIntance() {
		if(MyInstance == null) {
			MyInstance = new UndoSingleton();}
		return MyInstance;
	}
	
	private UndoSingleton() {
		list = new ArrayList<String>();
	}
	
	public ArrayList<String> getArray() {
		return this.list;
	}
	
	public void addToArray(String palabra) {
		list.add(palabra);
	}
	
	/*public void showMessage(){
	      System.out.println("Hello World!");
	   }*/

}
