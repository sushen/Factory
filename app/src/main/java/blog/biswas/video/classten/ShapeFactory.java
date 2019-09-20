package blog.biswas.video.classten;

public class ShapeFactory {
    public Shape getSape(String type){

        if (type.equals("rectangle")){
            return new Rectangle();
        }
        else if (type.equals("circle")){
            return new Circle();
        }
        else if (type.equals("line")){
            return new Line();
        }
        else return null;

//        return new Shape();
    }

}
