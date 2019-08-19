package giledRose;

import gildedRose.GildedRose;
import gildedRose.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GildedRoseTest {
    @Test
    public void should_return_1_given_a_normal_item_and_its_name_is_Aged_Brie_and_its_sellIn_is_5_quality_is_0() throws Exception {
        //given
        Item item = new Item("Aged Brie",5,0);
        Item[] items = new Item[1];
        items[0]=item;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(1, item.quality);
    }
    @Test
    public void should_return_53_given_a_normal_item_and_its_name_is_Aged_Brie_and_its_sellIn_is_5_quality_is_53() throws Exception {
        //given
        Item item = new Item("Aged Brie",5,53);
        Item[] items = new Item[1];
        items[0]=item;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(53, item.quality);
    }

    @Test
    public void should_return_26_given_a_normal_item_and_its_name_is_Backstage_and_its_sellIn_is_20_quality_is_25() throws Exception {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",20,25);
        Item[] items = new Item[1];
        items[0]=item;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(26, item.quality);
    }
    @Test
    public void should_return_55_given_a_normal_item_and_its_name_is_Backstage_and_its_sellIn_is_20_quality_is_55() throws Exception {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",20,55);
        Item[] items = new Item[1];
        items[0]=item;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(55, item.quality);
    }
    @Test
    public void should_return_27_given_a_normal_item_and_its_name_is_Backstage_and_its_sellIn_is_10_quality_is_25() throws Exception {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",10,25);
        Item[] items = new Item[1];
        items[0]=item;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(27, item.quality);
    }
    @Test
    public void should_return_50_given_a_normal_item_and_its_name_is_Backstage_and_its_sellIn_is_3_quality_is_48() throws Exception {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",3,48);
        Item[] items = new Item[1];
        items[0]=item;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(50, item.quality);
    }
    @Test
    public void should_return_21_given_a_normal_item_and_its_name_is_Backstage_and_its_sellIn_is_9_quality_is_19() throws Exception {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",9,19);
        Item[] items = new Item[1];
        items[0]=item;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(21, item.quality);
    }
    @Test
    public void should_return_0_given_a_normal_item_and_its_name_is_Backstage_and_its_sellIn_is_0_quality_is_21() throws Exception {
        //given
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert",0,21);
        Item[] items = new Item[1];
        items[0]=item;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(0, item.quality);
    }
    @Test
    public void should_return_24_given_a_normal_item_and_its_name_is_xxxxxx_and_its_sellIn_is_10_quality_is_25() throws Exception {
        //given
        Item item = new Item("xxxxxx",10,25);
        Item[] items = new Item[1];
        items[0]=item;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(24, item.quality);
    }
    @Test
    public void should_return_44_given_a_normal_item_and_its_name_is_xxxxxx_and_its_sellIn_is_10_quality_is_45() throws Exception {
        //given
        Item item = new Item("xxxxxx",10,45);
        Item[] items = new Item[1];
        items[0]=item;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(44, item.quality);
    }
    @Test
    public void should_return_0_given_a_normal_item_and_its_name_is_xxxxxx_and_its_sellIn_is_15_quality_is_0() throws Exception {
        //given
        Item item = new Item("xxxxxx",15,0);
        Item[] items = new Item[1];
        items[0]=item;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(0, item.quality);
    }
    @Test
    public void should_return_23_given_a_normal_item_and_its_name_is_xxxxxx_and_its_sellIn_is_0_quality_is_25() throws Exception {
        //given
        Item item = new Item("xxxxxx",0,25);
        Item[] items = new Item[1];
        items[0]=item;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(23, item.quality);
    }
    @Test
    public void should_return_60_given_a_normal_item_and_its_name_is_Sulfuras_and_its_sellIn_is_0_quality_is_60() throws Exception {
        //given
        Item item = new Item("Sulfuras, Hand of Ragnaros",0,60);
        Item[] items = new Item[1];
        items[0]=item;
        GildedRose gildedRose = new GildedRose(items);
        //when
        gildedRose.updateQuality();
        //then
        assertEquals(60, item.quality);
    }
}
