package mybook;

public class Image implements Element{

    private String imageName;

    public Image(String imageName) {
        super();
        this.setImageName(imageName);
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("Image with name: " + imageName);

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