package rentalstore;

public class LiteraryFilm extends Movie {
    public LiteraryFilm(String title, int priceCode) {
        super(title, priceCode);
    }
    @Override
    public double getThisAmount(int dayRented) {
        return dayRented*6.0;
    }

}
