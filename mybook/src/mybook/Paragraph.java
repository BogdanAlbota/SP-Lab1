package mybook;

public class Paragraph implements Element {
    private String name;

    public Paragraph(String name) {
        super();
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("Paragraph: " + name);

    }

    @Override
    public void add(Element element) {
        // TODO Auto-generated method stub

    }

	@Override
	public void remove(Element element) {
		// TODO Auto-generated method stub
		
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