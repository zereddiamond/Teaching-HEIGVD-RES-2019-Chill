package ch.heigvd.res.chill.domain.CrescenceK;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class GuinnessSmooth implements IProduct {

  public final static String NAME = "GuinnessSmooth";
  public final static BigDecimal PRICE = new BigDecimal(5.4);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
