using FeatureToggle.Toggles;

public class CoolNewFeature : SimpleFeatureToggle {}

public class Program {

  public static void Main(string[] args) {

    if (new CoolNewFeature().FeatureEnabled)
      Console.WriteLine("Hello, World!");
    else
      Console.WriteLine("Whatup, World!");
  }
}
