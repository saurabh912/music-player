package com.qspider.musicplayer.song;

public class Song {
	int id;
	private String song;
	private String singer;
	private String movie;
	private String composer;
	private double length;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", song=" + song + ", singer=" + singer + ", movie=" + movie + ", composer="
				+ composer + ", length=" + length + "]";
	}

}
