package FRQAP1;

public class AlterImage {

	public Pixel[][] generatePixelArray(int[][] reds, int[][] greens, int[][] blues) {
		Pixel[][] out = new Pixel[reds.length][reds[0].length];
		for(int x = 0; x < reds.length; x++) {
			for(int y = 0; y < reds[0].length; y++) {
				out[x][y] = new Pixel(reds[x][y], greens[x][y], blues[x][y]);
			}
		}
		return out;
	}
	
	public Pixel[][] flipImage(Pixel[][] image, boolean horizontal) {
		Pixel[][] out = new Pixel[image.length][image[0].length];
		if(horizontal) {
			for(int y = image.length - 1; y >= 0; y--) {
				for(int x = 0; x < image[0].length; x++) {
					out[image.length-1-y][x] = image[y][x];
				}
			}
		} else {
			for(int y = 0; y < image.length; y++) {
				for(int x = image[0].length-1; x >= 0; x--) {
					out[y][image[0].length-1-x] = image[y][x];
				}
			}
		}
		return out;
	}

}
