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
    private void whenItemQualityGreatThanZero(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}
