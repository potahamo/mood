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
import util.enumeration.NotificationType;

@Entity
public class NotificationEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationId;

    @Column(nullable = false)
    private NotificationType type;
    @Column(nullable = false)
    private boolean isSeen;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date timePosted;

    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private UserEntity fromUser;
    
    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private UserEntity toUser;

    public Long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notificationId != null ? notificationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the notificationId fields are not set
        if (!(object instanceof NotificationEntity)) {
            return false;
        }
        NotificationEntity other = (NotificationEntity) object;
        if ((this.notificationId == null && other.notificationId != null) || (this.notificationId != null && !this.notificationId.equals(other.notificationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.notificationEntity[ id=" + notificationId + " ]";
    }

    /**
     * @return the type
     */
    public NotificationType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(NotificationType type) {
        this.type = type;
    }

    /**
     * @return the isSeen
     */
    public boolean isIsSeen() {
        return isSeen;
    }

    /**
     * @param isSeen the isSeen to set
     */
    public void setIsSeen(boolean isSeen) {
        this.isSeen = isSeen;
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
     * @return the fromUser
     */
    public UserEntity getFromUser() {
        return fromUser;
    }

    /**
     * @param fromUser the fromUser to set
     */
    public void setFromUser(UserEntity fromUser) {
        this.fromUser = fromUser;
    }

    /**
     * @return the toUser
     */
    public UserEntity getToUser() {
        return toUser;
    }

    /**
     * @param toUser the toUser to set
     */
    public void setToUser(UserEntity toUser) {
        this.toUser = toUser;
    }

}
