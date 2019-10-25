package com.example.infs3634_task2_finalfinal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BurgerKongMenu {
    public static ArrayList<CategoryItem> getAllCategories() {
        return new ArrayList<CategoryItem>((List) Arrays.asList(categories.values().toArray()));
    }

    public static ProductItem getProductById(int productId) {
        return products.get(productId);
    }


    //"from traverse through hashmap"
    public static ArrayList<ProductItem> getProductByCategoryId(int categoryId) {
        ArrayList<ProductItem> myproducts = new ArrayList<>();
        Iterator hmIterator = products.entrySet().iterator();
        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) hmIterator.next();
            ProductItem productItem = ((ProductItem) mapElement.getValue());
            if (productItem.categoryId == categoryId) {
                myproducts.add(productItem);
            }
        }
        return myproducts;
    }

    public static ArrayList<ProductItem> getAllProducts() {
        return new ArrayList<ProductItem>((List) Arrays.asList(products.values().toArray()));
    }

    private static final HashMap<Integer, CategoryItem> categories = new HashMap<>();
    private static final HashMap<Integer, ProductItem> products = new HashMap<>();
    public static ArrayList<CartItem> cartItems=new ArrayList<>();

    static {
        //menu categories
        categories.put(1, new CategoryItem(
                1,
                "Bops",
                R.drawable.bops));

        categories.put(2, new CategoryItem(
                2,
                "Sides",
                R.drawable.side));

        categories.put(3, new CategoryItem(
                3,
                "Drinks",
                R.drawable.drink));

        categories.put(4, new CategoryItem(
                4,
                "Desserts",
                R.drawable.dessert));

        //food items

        //BOPS
        products.put(1, new ProductItem(
                1,
                1,
                "Bopper",
                "The perfect bopper for every taste bud. "
                        + "100% Angus beef topped with melted cheese, onions, tomato and lettuce on a toasted bun. "
                        + "Who wouldn't wanna bop to this?",
                "8",
                R.drawable.bops_bopper));
        products.put(2, new ProductItem(
                2,
                1,
                "Bopper Junior",
                "Just in case the main Bopper is just *too* much to handle, "
                        + "we got you covered with bite-sized mini boppers. "
                        + "Two in one serving, but you're bound to be back for more!",
                "5",
                R.drawable.bops_bopper_jr));
        products.put(3, new ProductItem(
                3,
                1,
                "Bopper Dog",
                "The classic hot dog with a bopper twist. "
                        + "Kidding, it is just a regular hot dog. "
                        + "Choice of chicken, beef or pork sausage.",
                "6",
                R.drawable.bops_bopper_dog));
        products.put(4, new ProductItem(
                4,
                1,
                "Bopperito",
                "Bopper wrapped up for you like a present. "
                        + "May be a little more messy, but tastes just as good!",
                "7",
                R.drawable.bops_bopperito));
        products.put(5, new ProductItem(
                5,
                1,
                "Bopwich",
                "This delight is loaded with tasty fillings like roasted chicken, tomatoes, "
                        + "basil and generous amounts of fresh mozarella in a soft pita bread.",
                "7",
                R.drawable.bops_bopwich));

        //SIDES
        products.put(6, new ProductItem(
                6,
                2,
                "Burly Fries",
                "Who doesn't get fries as their side? "
                        + "Fried crisp and golden, you would never want to miss out on this original favorite.",
                "3",
                R.drawable.side_burly_fries));
        products.put(7, new ProductItem(
                7,
                2,
                "Bopcorn Nugs",
                "Like chicken nuggets, but better.",
                "3",
                R.drawable.side_bopcornnugs));
        products.put(8, new ProductItem(
                8,
                2,
                "Onion Rings",
                "Something truly magical happens when you've got fried breaded onion rings. "
                        + "Full tastiness minus the breath.",
                "3",
                R.drawable.side_onion_rings));
        products.put(9, new ProductItem(
                9,
                2,
                "Bop Tots",
                "They look good, don't they? "
                        + "Don't just be a spec-(tater), have some as well!",
                "3",
                R.drawable.side_bop_tots));
        products.put(10, new ProductItem(
                10,
                2,
                "Salad",
                "Honestly you have come to the wrong place for this, "
                        + "but just in case you *really* crave it, we gotchu.",
                "1",
                R.drawable.side_salad));

        //DRINKS
        products.put(11, new ProductItem(
                11,
                3,
                "Fruitthie",
                "A smooth and icy blend of fresh fruits: frozen strawberries, mangoes and apples.",
                "3",
                R.drawable.drink_fruitthie));
        products.put(12, new ProductItem(
                12,
                3,
                "Iced Coffee",
                "Need a wake-up call? This is for you. Request for extra sugar if necessary.",
                "3",
                R.drawable.drink_ice_coffee));
        products.put(13, new ProductItem(
                13,
                3,
                "Milkshake",
                "Our milkshakes bring all the boys (and girls!) to the yard. "
                        + "A selection of vanilla or chocolate-blended ice-cream.",
                "2",
                R.drawable.drink_milkshake));
        products.put(14, new ProductItem(
                14,
                3,
                "Sweet Tea",
                "This iced lemon tea is absolutely refreshing for any time of day. Have a taste!",
                "2",
                R.drawable.drink_sweet_tea));
        products.put(15, new ProductItem(
                15,
                3,
                "Water",
                "Nothing beats plain ol’ water. ",
                "1",
                R.drawable.drink_water));

        //DESSERTS
        products.put(16, new ProductItem(
                16,
                4,
                "Brownie",
                "Ultra thick, fudgy and chewy, this brownie is a must-have if you want a dose of sweet chocolaty goodness.",
                "1.50",
                R.drawable.dessert_brownie));
        products.put(17, new ProductItem(
                17,
                4,
                "Fruit Cup",
                "Just in case you feel guilty with the fast food, you can order a fruit cup!",
                "2",
                R.drawable.dessert_fruit_cup));
        products.put(18, new ProductItem(
                18,
                4,
                "Pretzel",
                "This slightly glazed, super soft dough is the ultimate comfort food snack.",
                "2",
                R.drawable.dessert_pretzel));
        products.put(19, new ProductItem(
                19,
                4,
                "Ice-Cream Sundae",
                "With a choice of vanilla or chocolate ice-cream topped with rainbow sprinkles, "
                        + "this is a perfect treat for young and old alike.",
                "2",
                R.drawable.dessert_sundae));
        products.put(20, new ProductItem(
                20,
                4,
                "Waffle",
                "A classic but scrumptious treat topped with a choice of jam or ice-cream.",
                "4",
                R.drawable.dessert_waffle));
    }
}