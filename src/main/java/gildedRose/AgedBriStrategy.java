package gildedRose;

public class AgedBriStrategy extends ChangeStrategy {
    @Override
    void updateItem(Item item) {
        whenItemQualitySmallThanFifty(item);
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            whenItemQualitySmallThanFifty(item);
        }
    }

    private void whenItemQualitySmallThanFifty(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}