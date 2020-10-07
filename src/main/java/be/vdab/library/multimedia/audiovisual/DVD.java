package be.vdab.library.multimedia.audiovisual;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class DVD extends AudioVisual {

    private int subtitles;

    public int getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(int subtitles) {
        this.subtitles = subtitles;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "subtitles=" + subtitles +
                '}';
    }
}
