package entity;

import entity.AppEntity;
import entity.CommentEntity;
import entity.MoodboardEntity;
import entity.NotificationEntity;
import entity.ScreenshotEntity;
import entity.UserEntity;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-03T21:41:02")
@StaticMetamodel(UserEntity.class)
public class UserEntity_ { 

    public static volatile SingularAttribute<UserEntity, String> lastName;
    public static volatile SingularAttribute<UserEntity, String> country;
    public static volatile ListAttribute<UserEntity, MoodboardEntity> moodboards;
    public static volatile ListAttribute<UserEntity, CommentEntity> comments;
    public static volatile ListAttribute<UserEntity, UserEntity> connectionsOf;
    public static volatile SingularAttribute<UserEntity, Date> dateJoined;
    public static volatile SingularAttribute<UserEntity, String> bio;
    public static volatile SingularAttribute<UserEntity, Long> userId;
    public static volatile ListAttribute<UserEntity, ScreenshotEntity> screenshots;
    public static volatile ListAttribute<UserEntity, UserEntity> connectionsWith;
    public static volatile SingularAttribute<UserEntity, String> firstName;
    public static volatile SingularAttribute<UserEntity, String> password;
    public static volatile SingularAttribute<UserEntity, Long> phoneNumber;
    public static volatile SingularAttribute<UserEntity, String> email;
    public static volatile ListAttribute<UserEntity, NotificationEntity> notifications;
    public static volatile SingularAttribute<UserEntity, String> username;
    public static volatile ListAttribute<UserEntity, AppEntity> apps;

}