package toymarket;

public class ToyMarket {

    private Toy[] toys;

    public void setToys(Toy[] toys){
        this.toys = toys;

    }
    public ToyMarket() {
        this.toys = toys;
    }

    private Toy getToyByName(String name) {
        for (Toy toy : toys) {
            if (toy.getName().equals(name)) {
                return toy;
            }
        }
        throw new RuntimeException("Такой игрнушки нет " + name);
    }

    public void buyToy(Buyer buyer, String nameOfToy) {
        Toy chosenToy = getToyByName(nameOfToy);
        if (buyer.getMoney() > chosenToy.getPrice()) {
            buyer.decreaseMoney(chosenToy.getPrice());
            System.out.println("игрушка куплена " + nameOfToy);
        }
        else {
            System.out.println("не хватает денег на " + nameOfToy);
        }
    }
}
