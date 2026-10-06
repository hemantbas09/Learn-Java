package collection;

public class Member {
    private final int id;
    private final String name;

    Member(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public  String getName(){
        return name;
    }

}
