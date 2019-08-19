package gildedRose;

public class OtherNameStrategy extends ChangeStrategy {
    @Override
    void updateItem(Item item) {
        whenItemQualityGreatThanZero(item);
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            whenItemQualityGreatThanZero(item);
        }
    }
}
