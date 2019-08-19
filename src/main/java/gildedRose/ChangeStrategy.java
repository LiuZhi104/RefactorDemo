package gildedRose;

public  abstract class ChangeStrategy {
    abstract void updateItem(Item item);
    public void whenItemQualitySmallThanFifty(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
    public void whenItemQualityGreatThanZero(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}

