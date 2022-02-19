
public class NPC {
	public String name;
	public String id = "NPC";
	public String desc;
	int hp;
	int accuracy;
	int inRoom;

	public void look() {
		System.out.println(name);

		System.out.println("accuracy:" + accuracy);
		System.out.println("hp:" + hp);
	}
}
