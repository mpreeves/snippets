class PayCalculator {

  public static long totalPayForEmployee ( HourlyEmployee employee ) {
    RateRepository rr = new RateRepository ();
    long rate = rr.getRateById ( employee.id ); 
    return rate * employee.hours;
  }
}

class RateRepository {
  public long getRateById ( String id ) {
    if ( id == "1" )
      return 200;
    else
      return 20;  
  }
}

class HourlyEmployee {
  public long hours = 0;
  public String id = "";

  public HourlyEmployee ( String id, long hours ) {
    this.id = id;
    this.hours = hours;
  }
}
