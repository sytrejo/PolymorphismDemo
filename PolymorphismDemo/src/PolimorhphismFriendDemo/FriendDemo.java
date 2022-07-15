package PolimorhphismFriendDemo;

public class FriendDemo {
	
	public static void main(String[] args) {
		
		Friend friend1 = new Friend("Tom");
		Friend friend2 = new Friend(friend1, "Antonio");
		
		System.out.println(friend1);
		System.out.println(friend2);
	}

}
