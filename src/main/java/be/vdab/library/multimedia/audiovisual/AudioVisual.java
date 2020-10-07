package be.vdab.library.multimedia.audiovisual;

import be.vdab.library.multimedia.MultiMedia;

import javax.persistence.Entity;

@Entity
public class AudioVisual extends MultiMedia {

    private long duration;

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "AudioVisual{" +
                "duration=" + duration +
                '}';
    }
}
