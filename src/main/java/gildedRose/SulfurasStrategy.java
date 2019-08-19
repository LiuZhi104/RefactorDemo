package gildedRose;

public class SulfurasStrategy extends ChangeStrategy {
    @Override
    void updateItem(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
        }
    }
}
