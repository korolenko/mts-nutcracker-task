package korolenko.roman.nutcrackerStory;

import korolenko.roman.nutcrackerStory.buttle.*;
import korolenko.roman.nutcrackerStory.buttle.army.*;
import korolenko.roman.nutcrackerStory.characters.Doll;

import static korolenko.roman.nutcrackerStory.NoiseVolumes.*;
import static korolenko.roman.nutcrackerStory.buttle.OrderResult.*;
import static korolenko.roman.nutcrackerStory.buttle.army.Orders.*;

class Reader{
    private String name;
    public Reader(String name){
        this.name = name;
    }
    public void imagine(NoiseVolumes volume){
        if (volume != DOLLS_CRY){
            System.out.println(String.format("The reader can not imagine what is happening with noise %s",volume.name()));
        } else {
            System.out.println(String.format("The reader can imagine what is happening with noise %s",volume.name()));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Anonimous");

        Doll clerhen = new Doll("Clerhen",DOLLS_CRY);
        Doll trudhen = new Doll("Trudhen",DOLLS_CRY);

        clerhen.say("О неужели я должна умереть вот так, во цвете лет! Я! Самая красивая кукла!");
        trudhen.say("Для того ли я так долго и бережно хранилась, чтобы погибнуть здесь, в четырех стенах!");

        if(clerhen.makeHugs(trudhen)){
            clerhen.cry();
            trudhen.cry();
        }

        Commander polishinel = new Commander("Polishinel",BATTLE);
        Commander nutCracker = new Commander("Nutcracker",THE_FORMIDABLE_VOICE_OF_THE_NUTCRACKER);
        Army toys = new ToysArmy("toys",nutCracker);
        toys.setStaff(polishinel);
        Uniform toysUniform = new Uniform("military coat");
        ArmyTroops hussars = new ArmyTroops("hussars", null, toysUniform);
        ArmyTroops cuirassiers = new ArmyTroops("cuirassiers", null, toysUniform);
        ArmyTroops dragoons = new ArmyTroops("dragoons", null, toysUniform);
        toys.setStaff(cuirassiers);
        toys.setStaff(hussars);
        toys.setStaff(dragoons);
        toys.setStaff(new ArmyTroops("cavalry", null, toysUniform));
        toys.setStaff(new ArmyTroops("servants", null, toysUniform));
        Object guns = new Object();
        toys.setStaff(new ArmyTroops("artillery",guns, toysUniform));
        ArmyTroops toysArtilleryOnTheBench  = new ArmyTroops("artillery on the bench",guns, toysUniform);
        toys.setStaff(toysArtilleryOnTheBench);

        Commander mouseKing = new Commander("mouse king",SCREAMING_AND_SCREECHING_OF_THE_MOUSE_KING);
        MouseArmy mouseArmy = new MouseArmy("mouses",mouseKing);
        ArmyTroops mouseArtillery = new ArmyTroops("mouseArtillery",guns, null);

        Location room = new Location("room");
        room.addObject("bench");

        ButtleField buttleField = ButtleField.newBuilder()
                .addLocation(room)
                .addArmy(toys)
                .addArmy(mouseArmy)
                .addVolume(NoiseVolumes.BATTLE)
                .build();

        reader.imagine(buttleField.getNoise());
        reader.imagine(nutCracker.getVolume());
        reader.imagine(mouseKing.getVolume());

        nutCracker.giveAnOrder(ATTACK, toys.getName());
        polishinel.executeOrder(ATTACK);
        polishinel.executeOrder(ATTACK);

        OrderResult result = mouseArtillery.executeOrder(ATTACK);

        if(result == DISGUSTING_KERNELS){
            Uniform hussarsUniform = hussars.getUniform();
            hussarsUniform.setDirty(true);
        }
        OrderResult hussarsStatus = hussars.isAbleToFight();
        if(hussarsStatus == UNABLE_TO_FIGHT) {
            polishinel.giveAnOrder(RETREAT, hussars.getName());
            polishinel.giveAnOrder(RETREAT, cuirassiers.getName());
            polishinel.giveAnOrder(RETREAT, dragoons.getName());
            polishinel.giveAnOrder(RETREAT, polishinel.getName());
        }
        OrderResult rushingResult = mouseArmy.executeOrder(RUSHING_WITH_A_VICTORY_CRY);
        if(rushingResult == OVERTURN_THE_BENCH){
            toysArtilleryOnTheBench.executeOrder(ROLL_ON_THE_FLOOR);
            nutCracker.giveAnOrder(RETREAT_ON_THE_RIGHT_SIDE,"toys");
        }
    }
}
