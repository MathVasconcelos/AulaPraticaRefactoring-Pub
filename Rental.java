public class Rental {
   private Movie _movie;
   private int _daysRented;
   public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
   }
   public int getDaysRented() {
      return _daysRented;
   }
   public Movie getMovie() {
      return _movie;
   }

   public double getCharge() {
      double thisAmount = 0;
      switch (getMovie().getPriceCode()) {
       case Movie.REGULAR:
          thisAmount += 2;
          if (getDaysRented() > 2)
             thisAmount += (getDaysRented() - 2) * 1.5;
          break;
       case Movie.NEW_RELEASE:
          thisAmount += getDaysRented() * 3;
          break;
       case Movie.CHILDRENS:
          thisAmount += 1.5;
          if (getDaysRented() > 3)
             thisAmount += (getDaysRented() - 3) * 1.5;
           break;
    }
    return thisAmount;

      return _movie.getCharge(_daysRented);
   }

   public int getFrequentRenterPoints() {
      int frequentRenterPoints = 0;
      // add frequent renter points
      frequentRenterPoints ++;
      // add bonus for a two day new release rental
      if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
         this.getDaysRented() > 1) frequentRenterPoints ++;
         
      return frequentRenterPoints;
   }
}