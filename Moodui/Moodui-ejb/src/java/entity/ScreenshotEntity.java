package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ScreenshotEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long screenshotId;

    @Column(nullable = true)
    private String caption;
    @Column(nullable = false)
    private String photo;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date timePosted;
    
    @ManyToMany
    private List<UserEntity> favouriters;
    
    @OneToMany(mappedBy = "screenshot")
    private List<CommentEntity> comments;
    
    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private AppEntity app;
    
    @ManyToMany(mappedBy = "screenshots")
    private List<MoodboardEntity> moodboards;
    
    public Long getScreenshotId() {
        return screenshotId;
    }

    public void setScreenshotId(Long screenshotId) {
        this.screenshotId = screenshotId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (screenshotId != null ? screenshotId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the screenshotId fields are not set
        if (!(object instanceof ScreenshotEntity)) {
            return false;
        }
        ScreenshotEntity other = (ScreenshotEntity) object;
        if ((this.screenshotId == null && other.screenshotId != null) || (this.screenshotId != null && !this.screenshotId.equals(other.screenshotId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ScreenshotEntity[ id=" + screenshotId + " ]";
    }

    /**
     * @return the caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * @param caption the caption to set
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * @return the photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * @return the timePosted
     */
    public Date getTimePosted() {
        return timePosted;
    }

    /**
     * @param timePosted the timePosted to set
     */
    public void setTimePosted(Date timePosted) {
        this.timePosted = timePosted;
    }

    /**
     * @return the favouriters
     */
    public List<UserEntity> getFavouriters() {
        return favouriters;
    }

    /**
     * @param favouriters the favouriters to set
     */
    public void setFavouriters(List<UserEntity> favouriters) {
        this.favouriters = favouriters;
    }

    /**
     * @return the comments
     */
    public List<CommentEntity> getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(List<CommentEntity> comments) {
        this.comments = comments;
    }

    /**
     * @return the app
     */
    public AppEntity getApp() {
        return app;
    }

    /**
     * @param app the app to set
     */
    public void setApp(AppEntity app) {
        this.app = app;
    }

    /**
     * @return the moodboards
     */
    public List<MoodboardEntity> getMoodboards() {
        return moodboards;
    }

    /**
     * @param moodboards the moodboards to set
     */
    public void setMoodboards(List<MoodboardEntity> moodboards) {
        this.moodboards = moodboards;
    }
    
}
