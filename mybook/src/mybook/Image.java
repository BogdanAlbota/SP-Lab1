package mybook;

import java.awt.*;
import java.util.concurrent.TimeUnit;
public class Image extends ImageLoaderFactory implements Element,Picture  {
    private String imageName;
    
    @Override
    public String url() {
        return null;
    }
    @Override
    public Dimension dim() {
        return null;
    }
    @Override
    public String content() {
        return null;
    }
    @Override
    public Element get(int element) {
        return null;
    }
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void add(Element element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(Element element) {
		// TODO Auto-generated method stub
		
	}
}