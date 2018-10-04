package entity;

import entity.AppEntity;
import entity.CommentEntity;
import entity.MoodboardEntity;
import entity.UserEntity;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-03T21:41:02")
@StaticMetamodel(ScreenshotEntity.class)
public class ScreenshotEntity_ { 

    public static volatile SingularAttribute<ScreenshotEntity, Long> screenshotId;
    public static volatile SingularAttribute<ScreenshotEntity, AppEntity> app;
    public static volatile ListAttribute<ScreenshotEntity, CommentEntity> comments;
    public static volatile ListAttribute<ScreenshotEntity, MoodboardEntity> moodboards;
    public static volatile SingularAttribute<ScreenshotEntity, Date> timePosted;
    public static volatile SingularAttribute<ScreenshotEntity, String> caption;
    public static volatile SingularAttribute<ScreenshotEntity, String> photo;
    public static volatile ListAttribute<ScreenshotEntity, UserEntity> favouriters;

}