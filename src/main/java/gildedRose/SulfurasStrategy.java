package gildedRose;

public class SulfurasStrategy extends ChangeStrategy {
    @Override
    void updateItem(Item item) {
        whenItemQualitySmallThanZero(item);
        if (item.sellIn < 0) {
            whenItemQualitySmallThanZero(item);
        }
    }
    private void whenItemQualitySmallThanZero(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}
