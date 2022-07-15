package PolimorhphismFriendDemo;

public class Friend {
	
	private String name;
	private Friend friend;
	
	
	//This is needed to create the first friend
	public Friend(String name) {
		this.name = name;
	}
	
	//This can be used to create a friend with the first one
	public Friend(Friend friend, String name) {
		this.friend = friend;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}
	
	

}
