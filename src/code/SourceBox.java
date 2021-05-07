package code;

import java.util.LinkedList;
import java.util.List;

public class SourceBox {
	
	private int index;
	private boolean enable;
	private Position startPosition;
	private Position endPosition;
	private float startSize;
	private float endSize;
	private boolean enableCrop;
	private Crop startCrop;
	private Crop endCrop;
	
	public SourceBox() {}
	
	public SourceBox(int index, boolean enable, Position startPosition, Position endPosition, float startSize, float endSize, boolean enableCrop, Crop startCrop, Crop endCrop) {
		this.index = index;
		this.enable = enable;
		this.startPosition = startPosition;
		this.endPosition = endPosition;
		this.startSize = startSize;
		this.endSize = endSize;
		this.enableCrop = enableCrop;
		this.startCrop = startCrop;
		this.endCrop = endCrop;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public boolean isEnabled() {
		return this.enable;
	}
	
	public Position getStartPosition() {
		return this.startPosition;
	}
	
	public Position getEndPosition() {
		return this.endPosition;
	}
	
	
	public float getStartSize() {
		return this.startSize;
	}
	
	public float getEndSize() {
		return this.endSize;
	}
	
	public boolean isCropEnabled() {
		return this.enableCrop;
	}
	
	public Crop getStartCrop() {
		return this.startCrop;
	}
	
	public Crop getEndCrop() {
		return this.endCrop;
	}

	private List<Position> positions = new LinkedList<>(); 
	private List<Float> sizes = new LinkedList<>();
	private List<Crop> crops = new LinkedList<>();
	
	public void calculateFrames(int frameCount) {
		//position
		float stepSizePosX = (this.endPosition.getX() - this.startPosition.getX()) / (frameCount-1);
		float stepSizePosY = (this.endPosition.getY() - this.startPosition.getY()) / (frameCount-1);

		//first and last frame to be start and end position
		this.positions.add(this.startPosition);
		for(int i = 1; i < frameCount-1; i++) {
			this.positions.add(
				new Position(
					this.startPosition.getX()+stepSizePosX*i,
					this.startPosition.getY()+stepSizePosY*i
				)
			);
		}
		this.positions.add(this.endPosition);
		
		//size
		float stepSizeSize = (this.endSize - this.startSize) / (frameCount-1);

		//first and last frame to be start and end size
		this.sizes.add(this.startSize);
		for(int i = 1; i < frameCount-1; i++) {
			this.sizes.add(this.startSize+stepSizeSize*i);
		}
		this.sizes.add(this.endSize);
		
		
		//crop
		float stepSizeCropTop = (this.endCrop.getTop() - this.startCrop.getTop()) / (frameCount-1);
		float stepSizeCropLeft = (this.endCrop.getLeft() - this.startCrop.getLeft()) / (frameCount-1);
		float stepSizeCropRight = (this.endCrop.getRight() - this.startCrop.getRight()) / (frameCount-1);
		float stepSizeCropBottom = (this.endCrop.getBottom() - this.startCrop.getBottom()) / (frameCount-1);
		
		//first and last frame to be start and end size
		this.crops.add(this.startCrop);
		for(int i = 1; i < frameCount-1; i++) {
			this.crops.add(new Crop(
					this.startCrop.getTop()+stepSizeCropTop*i,
					this.startCrop.getLeft()+stepSizeCropLeft*i,
					this.startCrop.getRight()+stepSizeCropRight*i,
					this.startCrop.getBottom()+stepSizeCropBottom*i
				)
			);
		}
		this.crops.add(this.endCrop);
	}
	
	public Position getPosition(int i) {
		return positions.get(i);
	}

	public float getSize(int i) {
		return sizes.get(i);
	}
	
	public Crop getCrop(int i) {
		return crops.get(i);
	}
}
