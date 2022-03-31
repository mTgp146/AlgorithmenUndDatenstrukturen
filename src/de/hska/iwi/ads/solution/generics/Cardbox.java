package de.hska.iwi.ads.solution.generics;
import de.hska.iwi.ads.generics.Box;

public class Cardbox<T> extends Box<T>{

	public Cardbox(int volume, T content) {
		super(volume, content);
	}

	@Override
	public int compareTo(Box<T> o) {
		if (o.getVolume() > this.getVolume()) {
			return -(o.getVolume() / this.getVolume());
		} else if (this.getVolume() > o.getVolume()){
			return this.getVolume() / o.getVolume();
		} else {
			return 0;
		}
	}

}
