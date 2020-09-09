package moocInterface;

import java.util.ArrayList;

public class Box implements  Packable {
    private  double capacityOfBox;
    private ArrayList<Packable> items;


    public Box(double capacityOfBox) {
        this.capacityOfBox = capacityOfBox;
        items= new ArrayList<>();
    }

    public void  add(Packable packable){
        if (weight()+ packable.weight() <= capacityOfBox) {
            items.add(packable);

        }
    }

    public double weight(){
        double totalWeight=0;
        for (Packable p: items) {
            totalWeight += p.weight();
        }
        return  totalWeight;
    }

    @Override
    public String toString() {
        return "Box: "+items.size()+" items, total weight "+weight()+" kg";
    }
}
