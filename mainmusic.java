package com.qspider.musicplayer;

import java.util.Scanner;

import com.qspider.musicplayer.song.opration.SongOpertion;

public class mainmusic {
	static boolean loop = true;
	static SongOpertion run = new SongOpertion();

	public static void main(String[] args) {
		musicMenu();

		while (loop) {
			musicMenu();
		}

	}

	public static void musicMenu() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Menu :- \n 1.play \n 2.Add/Remove \n 3.Edit \n 4.Exit");
		System.err.println("choose option :-");
		int key = sc.nextInt();
		switch (key) {
		case 1: {
			System.out.println("1. choose song \n 2. all songs \n 3. random song \n 4. go back.");
			System.err.println("choose option :-");
			int choose = sc.nextInt();
			switch (choose) {
			case 1: {
				run.ChooseSongPlay();
				break;
			}
			case 2: {
				run.PlayAllSong();
				break;
			}
			case 3: {
				run.PlayRandom();
				break;
			}
			case 4: {
				break;
			}

			}

			break;
		}
		case 2: {
			System.out.println("1.Add song \n 2.Remove song \n 3. go back");
			System.err.println("choose option :-");
			int key2 = sc.nextInt();
			switch (key2) {
			case 1: {
				run.addSongs();
				break;
			}
			case 2: {
				run.removeSong();
				break;
			}
			case 3: {

				break;
			}
			}

			loop = false;
			musicMenu();
			break;
		}
		case 3: {
			run.update();
			loop = false;
			musicMenu();
			break;
		}
		case 4: {
			loop = false;
			musicMenu();
			break;
		}
		}

	}
}
