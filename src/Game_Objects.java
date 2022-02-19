import java.util.ArrayList;

public class Game_Objects {
    static PC pc = new PC();
    static ArrayList<Room> room = new ArrayList<Room>();

    static ArrayList<Object> NPCDataBase = new ArrayList<Object>();

    public static void initializeNPCArray() {
        NPCDataBase.add(new NPC());
        NPCDataBase.add(new Troll());
        NPCDataBase.add(new Dragon());
    }
}
