package ch.heigvd.res.chill.domain.volkan05;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Cardinal implements IProduct {

  public final static String NAME = "Cardinal";
  public final static BigDecimal PRICE = new BigDecimal(2.1);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
