package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import util.enumeration.CommentType;

@Entity
public class CommentEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    @Column(nullable = false)
    private String text;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date timePosted;
    @Column(nullable = false)
    private CommentType type;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private UserEntity poster;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private AppEntity app;
    
    @ManyToOne(optional = true)
    @JoinColumn(nullable = true)
    private ScreenshotEntity screenshot;
    
    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (commentId != null ? commentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the commentId fields are not set
        if (!(object instanceof CommentEntity)) {
            return false;
        }
        CommentEntity other = (CommentEntity) object;
        if ((this.commentId == null && other.commentId != null) || (this.commentId != null && !this.commentId.equals(other.commentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.CommentEntity[ id=" + commentId + " ]";
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
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
     * @return the type
     */
    public CommentType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(CommentType type) {
        this.type = type;
    }

    /**
     * @return the poster
     */
    public UserEntity getPoster() {
        return poster;
    }

    /**
     * @param poster the poster to set
     */
    public void setPoster(UserEntity poster) {
        this.poster = poster;
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
     * @return the screenshot
     */
    public ScreenshotEntity getScreenshot() {
        return screenshot;
    }

    /**
     * @param screenshot the screenshot to set
     */
    public void setScreenshot(ScreenshotEntity screenshot) {
        this.screenshot = screenshot;
    }

}
