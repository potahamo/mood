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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private Long phoneNumber;
    @Column(nullable = true)
    private String bio;
    @Column(nullable = true)
    private String country;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dateJoined;
    
    @ManyToMany
    @JoinTable(name="table_connections", 
            joinColumns=@JoinColumn(name="PersonId"),
            inverseJoinColumns=@JoinColumn(name="connectionId"))
    private List<UserEntity> connectionsWith;
    
    @ManyToMany
    @JoinTable(name="table_connections", 
            joinColumns=@JoinColumn(name="connectionId"),
            inverseJoinColumns=@JoinColumn(name="PersonId"))
    private List<UserEntity> connectionsOf;
    //Refernce from https://stackoverflow.com/questions/1656113/hibernate-recursive-many-to-many-association-with-the-same-entity
    
    @OneToMany(mappedBy = "toUser")
    private List<NotificationEntity> notifications;
    
    @OneToMany(mappedBy = "poster")
    private List<AppEntity> apps;
    
    @OneToMany(mappedBy = "owner")
    private List<MoodboardEntity> moodboards;
    
    @OneToMany(mappedBy = "poster")
    private List<CommentEntity> comments;
    
    @ManyToMany(mappedBy = "favouriters")
    private List<ScreenshotEntity> screenshots;
    
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the userId fields are not set
        if (!(object instanceof UserEntity)) {
            return false;
        }
        UserEntity other = (UserEntity) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.UserEntity[ id=" + userId + " ]";
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the phoneNumber
     */
    public Long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the bio
     */
    public String getBio() {
        return bio;
    }

    /**
     * @param bio the bio to set
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the dateJoined
     */
    public Date getDateJoined() {
        return dateJoined;
    }

    /**
     * @param dateJoined the dateJoined to set
     */
    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    /**
     * @return the connectionsWith
     */
    public List<UserEntity> getConnectionsWith() {
        return connectionsWith;
    }

    /**
     * @param connectionsWith the connectionsWith to set
     */
    public void setConnectionsWith(List<UserEntity> connectionsWith) {
        this.connectionsWith = connectionsWith;
    }

    /**
     * @return the connectionsOf
     */
    public List<UserEntity> getConnectionsOf() {
        return connectionsOf;
    }

    /**
     * @param connectionsOf the connectionsOf to set
     */
    public void setConnectionsOf(List<UserEntity> connectionsOf) {
        this.connectionsOf = connectionsOf;
    }

    /**
     * @return the notifications
     */
    public List<NotificationEntity> getNotifications() {
        return notifications;
    }

    /**
     * @param notifications the notifications to set
     */
    public void setNotifications(List<NotificationEntity> notifications) {
        this.notifications = notifications;
    }

    /**
     * @return the apps
     */
    public List<AppEntity> getApps() {
        return apps;
    }

    /**
     * @param apps the apps to set
     */
    public void setApps(List<AppEntity> apps) {
        this.apps = apps;
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
