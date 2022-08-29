package Modul320;

public class Competition {
    private String name;
    private Ship[] ships = new Ship[5];

    public Competition(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void start() {
        for (int i = 0; i < ships.length; i++){
            if(ships[i] != null){
                Ship s = ships[i];
                s.race();
            }
        }
    }


    public void addShip(Ship ship) {
        for(int i =0; i < ships.length; i++){
            if(ships[i] == null){
                ships[i]= ship;
                break;
            }
        }
    }


    public void printResult() {
        System.out.println("Wettkampf" + this.name);


        for (Ship s : this.ships){
            if (s != null){
                String ownerOutput = " Besitzer: ";

                Person owner = s.getOwner();
                if (owner != null) {
                    ownerOutput += owner.getFirstname() + " " + owner.getLastname();
                }

                System.out.println(
                        "Schiff Nr: " + s.getNumber() + " Name: " + s.getName() + ownerOutput + " Zeit: " + s.getTime());
            }
        }
        }
    }



