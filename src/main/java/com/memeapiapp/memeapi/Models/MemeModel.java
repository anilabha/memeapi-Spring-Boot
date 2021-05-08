package com.memeapiapp.memeapi.Models;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name = "MemeModel")
public class MemeModel {
    @Id
    @SequenceGenerator(
            name = "meme_sequence",
            sequenceName = "meme_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "meme_sequence"
    )
    @Column(
            name = "meme_id",
            updatable = false
    )
    private Long meme_id;

    @Column(
            name = "meme_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String meme_name;
    @Column(
            name = "meme_url",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String meme_url;

    public MemeModel(Long meme_id, String meme_name, String meme_url) {
        this.meme_id = meme_id;
        this.meme_name = meme_name;
        this.meme_url = meme_url;
    }

    public MemeModel() {

    }

    public Long getMeme_id() {
        return meme_id;
    }

    public void setMeme_id(Long meme_id) {
        this.meme_id = meme_id;
    }

    public String getMeme_name() {
        return meme_name;
    }

    public void setMeme_name(String meme_name) {
        this.meme_name = meme_name;
    }

    public String getMeme_url() {
        return meme_url;
    }

    public void setMeme_url(String meme_url) {
        this.meme_url = meme_url;
    }

    @Override
    public String toString() {
        return "MemeModel{" +
                "meme_id=" + meme_id +
                ", meme_name='" + meme_name + '\'' +
                ", meme_url='" + meme_url + '\'' +
                '}';
    }
}
