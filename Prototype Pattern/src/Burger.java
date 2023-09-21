public abstract class Burger implements Cloneable {
    protected String Name;
    protected String Description;
    abstract void draw();
    public String getName(){
        return Name;
    }
    public String getDescription() {
        return Description;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}