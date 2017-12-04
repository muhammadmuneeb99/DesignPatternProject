import java.util.ArrayList;
import java.util.List;

public class Biryani {
    List<IFoodItems> biryanilist = new ArrayList<>();

    public Biryani() {
    	biryanilist.add(new ChickenBiryani());
    	biryanilist.add(new BeefBiryani());
    	biryanilist.add(new MashroomBiryani());

    }

}
