using FeatureToggle.Toggles;

public class CoolNewFeature : SimpleFeatureToggle {}

public class Program {

  public static void Main(string[] args) {

    if (new CoolNewFeature().FeatureEnabled)
      Console.WriteList("Hello, World!");
    else
      Console.WriteList("Whatup, World!");
  }
}
