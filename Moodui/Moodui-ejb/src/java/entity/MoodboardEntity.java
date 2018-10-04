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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class MoodboardEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long moodboardId;

    @Column(nullable = false)
    private String name;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dateCreated;
    @Column(nullable = true)
    private String description;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private UserEntity owner;
    
    @ManyToMany
    private List<ScreenshotEntity> screenshots;
    
    public Long getMoodboardId() {
        return moodboardId;
    }

    public void setMoodboardId(Long moodboardId) {
        this.moodboardId = moodboardId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (moodboardId != null ? moodboardId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the moodboardId fields are not set
        if (!(object instanceof MoodboardEntity)) {
            return false;
        }
        MoodboardEntity other = (MoodboardEntity) object;
        if ((this.moodboardId == null && other.moodboardId != null) || (this.moodboardId != null && !this.moodboardId.equals(other.moodboardId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.MoodboardEntity[ id=" + moodboardId + " ]";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dateCreated
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the owner
     */
    public UserEntity getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(UserEntity owner) {
        this.owner = owner;
    }

    /**
     * @return the screenshots
     */
    public List<ScreenshotEntity> getScreenshots() {
        return screenshots;
    }

    /**
     * @param screenshots the screenshots to set
     */
    public void setScreenshots(List<ScreenshotEntity> screenshots) {
        this.screenshots = screenshots;
    }

}
