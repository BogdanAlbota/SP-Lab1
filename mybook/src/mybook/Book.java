package mybook;
import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
    private String name;
    private String text;
    private ArrayList<Author> authors;
    private ArrayList<Chapter> chapters;
    private ArrayList<TableOfContents> tableOfContents;

    private ArrayList<Element> content;

    public Book(String name) {
        
        super(name);
        this.name = name;
        this.text = text;
        this.authors =  new ArrayList<>();
        this.chapters = new ArrayList<>();

        this.authors =  new ArrayList<>();
        this.content =  new ArrayList<>();
    }

    public String getName() {
    
        return this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addAuthor(Author a) {
        authors.add(a);
    }

    public int createChapter(String chapter){
        Chapter chp = new Chapter(chapter);
        chapters.add(chp);
        return chapters.indexOf(chp);
    }
    public Chapter getChapter(int i){
        return chapters.get(i); }

    public void addContent(Element elem) {
        content.add(elem);

    }

    public void printAuthors() {
        for(int i=0; i < authors.size(); i++) {
            System.out.println(authors.get(i).toString());}}
    public void print() {
        System.out.println(name);
        for(Author auth:authors) {
            auth.print();
        }
        for(Element elm:content) {
            elm.print();
        }
    }


    public ArrayList<TableOfContents> getTableOfContents() {
        return tableOfContents;
    }

    public void setTableOfContents(ArrayList<TableOfContents> tableOfContents) {
        this.tableOfContents = tableOfContents;
    }

}