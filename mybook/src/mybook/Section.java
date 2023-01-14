package mybook;

import java.util.ArrayList;

public class Section implements Element{

    private String name;
    private ArrayList sections;
    private ArrayList<Element> elements;



    
    public Section(String name) {
        super();
        this.name = name;
        this.sections = new ArrayList();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        elements = new ArrayList<>();
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub

        System.out.println(name);
        for(Element elm:elements) {
            elm.print();
        }
    }

    @Override
    public void add(Element element) {
        // TODO Auto-generated method stub

        elements.add(element);
    }

    @Override
    public void remove(Element element) {
        // TODO Auto-generated method stub
        elements.remove(element);

    }
	@Override
	public void get(Element element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Element get(int element) {
		// TODO Auto-generated method stub
		return null;
	}}