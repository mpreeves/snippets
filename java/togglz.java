public enum MyFeatures implements Feature {

  @Label("First Feature")
    FEATURE_ONE,

  @Label("Second Feature")
    FEATURE_TWO;

  public boolean isActive() {
    return FeatureContext.getFeatureManager().isActive(this);
  }

}

public void someBusinessMethod() {

  if( MyFeatures.FEATURE_ONE.isActive() ) {
    // do new exciting stuff here
  }

}
