package be.vdab.library.multimedia.audiovisual;

import javax.persistence.Entity;

@Entity
public class CD extends AudioVisual {
    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }

    private int tracks;

    @Override
    public String toString() {
        return "CD{" +
                "tracks=" + tracks +
                '}';
    }
}
