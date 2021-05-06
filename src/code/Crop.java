package code;

public class Crop {
	private float top, left, right, bottom = 0;
	
	public Crop() {}
	
	public Crop(float top, float left, float right, float bottom) {
		this.top = top;
		this.left = left;
		this.right = right;
		this.bottom = bottom;
	}
	
	public float getTop() {
		return this.top;
	}
	
	public float getLeft() {
		return this.left;
	}
	
	public float getRight() {
		return this.right;
	}
	
	public float getBottom() {
		return this.bottom;
	}
	
	public void setTop(float top) {
		this.top = top;
	}
	
	public void setLeft(float left) {
		this.left = left;
	}
	
	public void setRight(float right) {
		this.right = right;
	}
	
	public void setBottom(float bottom) {
		this.bottom = bottom;
	}
}
