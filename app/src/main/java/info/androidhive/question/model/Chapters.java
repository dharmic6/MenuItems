package info.androidhive.question.model;

public class Chapters
{
    private String name;

    private String image;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getImage ()
    {
        return image;
    }

    public void setImage (String image)
    {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Chapters{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
