package Classes;

/**
 * Created by Styrmir on 22.3.2017.
 */

//github comment test

public class Image {
    private int id;
    private String path;
    private String fileName;

    //constructor
    public Image(){}

    //setters, getters
    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFileName(){
        return this.fileName;
    }

    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    public String getPath(){
        return this.path;
    }

    public void setPath(String path){
        this.path = path;
    }
}
