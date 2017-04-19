struct Point {
  double x, y;
}

public enum ShapeType {
  square, circle
};

public class Shape {
  private ShapeType type;

  public Shape(ShapeType t){
    type = t;
  }

  public static void DrawShape(Shape s) {
    if(s.type == ShapeType.square) {
      (Square s).Draw();
    }
    else if(s.type == ShapeType.circle) {
      (Circle s).Draw();
    }
  }
}

public class Circle extends Shape {
  private Point center;
  private double radius;

  public Circle() {
    super( ShapeType.circle );
  }

  public void Draw() {/* draws the circle */}
}

public class Square extends Shape {
  private Point topLeft;
  private double side;

  public Square() {
    super(ShapeType.square) {
    }
  }

  public void Draw() {/* draws the square */}
}

