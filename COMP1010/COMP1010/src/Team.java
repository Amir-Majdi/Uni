import java.util.ArrayList;

class Team {
    private String name;
    //arraylist of character objects
    private ArrayList<Character> members;  

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addMember(Character character) {
        //add a character to the team
        members.add(character);  
    }

    public boolean hasAliveMembers() {
        for (Character character : members) {
            if (character.isAlive()) {
                return true;
            }
        }
        return false;
    }

    public Character getFirstAliveMember() {
        for (Character character : members) {
            if (character.isAlive()) {
                return character;
            }
        }
        //no alive members
        return null;  
    }

    public void displayTeamStatus() {
        System.out.println("Team " + name + " Status:");
        for (Character character : members) {
            System.out.println(character.getName() + " - Health: " + character.getHealth());
        }
    }
}
