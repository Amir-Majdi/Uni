import java.util.Scanner;

public class TestCase {

    public static void main(String[] args) {
        testPredefinedCharacterCreation();
        testCustomCharacterCreationValidPoints();
        testCustomCharacterCreationExcessPoints();
        testBasicAttack();
        testCriticalHit();
        testDefenseMechanic();
        testMissChance();
        testEndOfBattle();
        testBattleLogSaving();
        testTeamAliveMemberCheck();
    }

    public static void testPredefinedCharacterCreation() {
        Character aang = new Character("Aang", 30, 10, 5, 8);
        Character deadpool = new Character("Deadpool", 25, 12, 4, 7);

        System.out.println("Testing predefined character creation:");
        System.out.println("Aang - Health: " + aang.getHealth());
        System.out.println("Deadpool - Health: " + deadpool.getHealth());
        System.out.println();
    }

    public static void testCustomCharacterCreationValidPoints() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Testing custom character creation with valid points allocation:");
        Character custom = App.createCustomCharacter(scanner, "TestHero");

        System.out.println("Custom Character - Health: " + custom.getHealth());
        System.out.println();
    }

    public static void testCustomCharacterCreationExcessPoints() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Testing custom character creation with excess points allocation:");
        Character custom = App.createCustomCharacter(scanner, "ExcessHero");

        System.out.println("Excess Points Character - Health: " + custom.getHealth());
        System.out.println();
    }

    public static void testBasicAttack() {
        Character attacker = new Character("Attacker", 30, 10, 5, 5);
        Character defender = new Character("Defender", 30, 5, 3, 5);
        BattleLog log = new BattleLog();

        System.out.println("Testing basic attack functionality:");
        attacker.attack(defender, log);
        defender.displayHealth();
        System.out.println();
    }

    public static void testCriticalHit() {
        //high intelligence for crit chance
        Character attacker = new Character("Attacker", 30, 10, 5, 100);  
        Character defender = new Character("Defender", 30, 5, 3, 5);
        BattleLog log = new BattleLog();

        System.out.println("Testing critical hit:");
        attacker.attack(defender, log);
        defender.displayHealth();
        System.out.println();
    }

    public static void testDefenseMechanic() {
        Character defender = new Character("Defender", 30, 5, 10, 5);
        BattleLog log = new BattleLog();

        System.out.println("Testing defense mechanic:");
        defender.defend(log);
        defender.displayHealth();
        //reset defense after defending
        defender.resetDefense(10);  
        System.out.println();
    }

    public static void testMissChance() {
        Character attacker = new Character("Attacker", 30, 5, 5, 5);
        //high defense
        Character defender = new Character("Defender", 30, 3, 20, 5);  
        BattleLog log = new BattleLog();

        System.out.println("Testing miss chance due to high defense:");
        attacker.attack(defender, log);
        defender.displayHealth();
        System.out.println();
    }

    public static void testEndOfBattle() {
        Character hero = new Character("Hero", 10, 5, 5, 5);
        Character villain = new Character("Villain", 5, 3, 2, 5);
        BattleLog log = new BattleLog();

        System.out.println("Testing end of battle:");
        //villain's health should drop to zero
        hero.attack(villain, log);  
        
        villain.displayHealth();
        System.out.println("Is Villain alive? " + villain.isAlive());
        System.out.println();
    }

    public static void testBattleLogSaving() {
        BattleLog log = new BattleLog();
        log.addMove("Hero attacked Villain");
        log.addMove("Villain defended");

        System.out.println("Testing battle log saving to file:");
        log.saveToFile("test_moves.txt");
        System.out.println("Battle log saved to test_moves.txt");
        System.out.println();
    }

    public static void testTeamAliveMemberCheck() {
        Team team = new Team("Heroes");
        Character hero1 = new Character("Hero1", 10, 5, 5, 5);
        //dead character
        Character hero2 = new Character("Hero2", 0, 5, 5, 5);  

        team.addMember(hero1);
        team.addMember(hero2);

        System.out.println("Testing team alive member check:");
        System.out.println("Does the team have alive members? " + team.hasAliveMembers());
        System.out.println();
    }
}
