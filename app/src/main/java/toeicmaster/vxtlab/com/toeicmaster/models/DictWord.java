package toeicmaster.vxtlab.com.toeicmaster.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by thong on 7/27/2018.
 */

public class DictWord extends RealmObject {
    @PrimaryKey
    private int id;
    private String word;
    private String pronun;
    private String mean;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPronun() {
        return pronun;
    }

    public void setPronun(String pronun) {
        this.pronun = pronun;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }
}
