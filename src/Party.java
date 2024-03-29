import java.util.ArrayList;

public class Party {
	private ArrayList<Friend> friends;

	public Party() {
		friends = new ArrayList<Friend>();
	}

	public void addPeople() {
 friends.add(new Friend("Cyndi", "crader"));
 friends.add(new Friend("Jane", "jsmith"));
 friends.add(new Friend("Joe", "jdoe"));
	}

	public void showPeople() {
		System.out.println("Who's Coming to the Party?");
		for (Friend friend : friends) {
			System.out.println(friend);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Party party = new Party();
		party.addPeople();
		party.showPeople();

	}

}
