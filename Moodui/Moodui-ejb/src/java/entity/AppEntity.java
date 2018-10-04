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
public class AppEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appId;

    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = true)
    private String description;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dateCreated;
    @Column(nullable = false)
    private boolean isPublic;
    @Column(nullable = true)
    private String logo;
    
    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private UserEntity poster;
    
    @OneToMany(mappedBy = "app")
    private List<CommentEntity> comments;
    
    @ManyToMany(mappedBy = "apps")
    private List<CategoryEntity> categories;
    
    @OneToMany(mappedBy = "app")
    private List<ScreenshotEntity> screenshots;
    
    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (appId != null ? appId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the appId fields are not set
        if (!(object instanceof AppEntity)) {
            return false;
        }
        AppEntity other = (AppEntity) object;
        if ((this.appId == null && other.appId != null) || (this.appId != null && !this.appId.equals(other.appId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.AppEntity[ id=" + appId + " ]";
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
     * @return the isPublic
     */
    public boolean isIsPublic() {
        return isPublic;
    }

    /**
     * @param isPublic the isPublic to set
     */
    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    /**
     * @return the logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * @param logo the logo to set
     */
    public void setLogo(String logo) {
        this.logo = logo;
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
     * @return the categories
     */
    public List<CategoryEntity> getCategories() {
        return categories;
    }

    /**
     * @param categories the categories to set
     */
    public void setCategories(List<CategoryEntity> categories) {
        this.categories = categories;
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
