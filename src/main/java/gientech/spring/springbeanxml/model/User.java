package gientech.spring.springbeanxml.model;

import java.util.List;

public class User {

    private String name;
    private int age;
    private List<String> favorites;

    public User(){}

    public User(String name, int age, List<String> favorites){
        this.name = name;
        this.age = age;
        this.favorites = favorites;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public List<String> getfavorites(){
        return favorites;
    }
    public void setFavorites(List<String> favorites){
        this.favorites = favorites;
    }

    @Override
    public String toString(){
        return "name="+name+", age="+age+", favorites="+favorites;
    }
}
