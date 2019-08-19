package gildedRose;

public class BackstageStrategy extends ChangeStrategy {
    @Override
    void updateItem(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;

            if (item.sellIn < 11) {
                whenItemQualitySmallThanFifty(item);
            }

            if (item.sellIn < 6) {
                whenItemQualitySmallThanFifty(item);
            }
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            item.quality = item.quality - item.quality;
        }
    }

}
