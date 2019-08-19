package gildedRose;

public class SulfurasStrategy extends ChangeStrategy {
    @Override
    void updateItem(Item item) {
        whenItemQualityGreatThanZero(item);
        if (item.sellIn < 0) {
            whenItemQualityGreatThanZero(item);
        }
    }
}
