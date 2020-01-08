package mds.dp.adapter;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter theMediaAdapter;

	/**
	 * 
	 * Example : audioPlayer.play("mp3", "beyond the horizon.mp3");
	 */
	public void play(String type, String file) {
		if (type == "mp3")
			System.out.println("Playing mp3 file. Name: " + file);
		else {

			try {
				this.theMediaAdapter = new MediaAdapter(type);
			} catch (NullPointerException e) {
				System.err.println("The extension may not be supported." + e.getMessage());
			}

			this.theMediaAdapter.play(type, file);
			this.theMediaAdapter = null ;

		}

	}
}
