class Cart {
  
  private List<OrderItem> items = new ArrayList<OrderItem>();

  public void add ( OrderItem item ) {
    this.items.add ( item );
  }

  public long calcTotal () {

    long total = 0;

    for ( OrderItem item : items ) {
      if ( item.sku.startsWith ( "STANDARD" ) ) {
        total += item.quantity * 4;
      }
      else if ( item.sku.startsWith ( "HIGH" ) ) {
        total += item.quantity * 5;
      }
      else if ( item.sku.startsWith ( "SPECIAL" ) ) {
        if (item.quantity > 3)
          total += item.quantity * 2;
        else
          total += item.quantity * 3;
      }
    }

    return total;
  }
}

class OrderItem {
  
  public int quantity = 0;
  public String sku = "";

  public OrderItem ( String sku, int quantity ) {
    this.quantity = quantity;
    this.sku = sku;
  }
}
