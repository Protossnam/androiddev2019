package vn.edu.usth.mypro.Home;

import android.widget.Button;

import java.util.ArrayList;

import vn.edu.usth.mypro.R;

public class SiteNewsModel {
    int imageID;
    private String title;
    Button downloadButton;

    public SiteNewsModel(int imageID, String title) {
        this.title = title;
        this.imageID = imageID;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static ArrayList<SiteNewsModel> SiteNews = new ArrayList<>();

    public static void init() {
        SiteNews.add(new SiteNewsModel(R.drawable.news, "Site News"));
        SiteNews.add(new SiteNewsModel(R.drawable.pdf, "Moodle Lecturer Guide"));
        SiteNews.add(new SiteNewsModel(R.drawable.pdf, "Moodle Student Guide"));
        SiteNews.add(new SiteNewsModel(R.drawable.pdf, "Moodle Assistant Guide"));
        SiteNews.add(new SiteNewsModel(R.drawable.pdf, "1"));
        SiteNews.add(new SiteNewsModel(R.drawable.pdf, "2"));
        SiteNews.add(new SiteNewsModel(R.drawable.pdf, "3"));
        SiteNews.add(new SiteNewsModel(R.drawable.pdf, "4"));
        SiteNews.add(new SiteNewsModel(R.drawable.pdf, "5"));
        SiteNews.add(new SiteNewsModel(R.drawable.pdf, "6"));
        SiteNews.add(new SiteNewsModel(R.drawable.pdf, "7"));
        SiteNews.add(new SiteNewsModel(R.drawable.pdf, "8"));
        SiteNews.add(new SiteNewsModel(R.drawable.pdf, "9"));
        SiteNews.add(new SiteNewsModel(R.drawable.pdf, "10"));

    }
}
