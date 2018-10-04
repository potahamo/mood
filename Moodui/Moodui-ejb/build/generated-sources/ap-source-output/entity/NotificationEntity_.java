package entity;

import entity.UserEntity;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import util.enumeration.NotificationType;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-03T21:41:02")
@StaticMetamodel(NotificationEntity.class)
public class NotificationEntity_ { 

    public static volatile SingularAttribute<NotificationEntity, UserEntity> toUser;
    public static volatile SingularAttribute<NotificationEntity, UserEntity> fromUser;
    public static volatile SingularAttribute<NotificationEntity, Date> timePosted;
    public static volatile SingularAttribute<NotificationEntity, Long> notificationId;
    public static volatile SingularAttribute<NotificationEntity, NotificationType> type;
    public static volatile SingularAttribute<NotificationEntity, Boolean> isSeen;

}