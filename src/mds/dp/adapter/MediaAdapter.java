package mds.dp.adapter;

public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer theAdvancedMediaPlayer;
	

	/**
	 * 
	 * @param type 'vlc' or 'mp4' supported
	 */
	public MediaAdapter(String type) {
		if (type == "vlc")
			this.theAdvancedMediaPlayer = new VlcPlayer();
		else {
			if (type == "mp4")
				this.theAdvancedMediaPlayer = new Mp4Player();
			else {
				if (type == "avi") 
					System.out.println("!! AVI isnt't supported yet.");
				else {
					System.out.println("!! This format '"+type+"' is unknown.");
				}
			}
		}
	}

	@Override
	public void play(String type, String file) {

		// !!!! ptet verifier que pas null
		if (type == "vlc")
			this.theAdvancedMediaPlayer.playVlc(file);
		if (type == "mp4")
			this.theAdvancedMediaPlayer.playMp4(file);
	}

}
