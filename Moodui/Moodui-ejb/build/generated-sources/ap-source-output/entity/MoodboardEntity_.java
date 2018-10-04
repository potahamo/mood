package entity;

import entity.ScreenshotEntity;
import entity.UserEntity;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-03T21:41:02")
@StaticMetamodel(MoodboardEntity.class)
public class MoodboardEntity_ { 

    public static volatile SingularAttribute<MoodboardEntity, UserEntity> owner;
    public static volatile SingularAttribute<MoodboardEntity, Date> dateCreated;
    public static volatile SingularAttribute<MoodboardEntity, Long> moodboardId;
    public static volatile SingularAttribute<MoodboardEntity, String> name;
    public static volatile SingularAttribute<MoodboardEntity, String> description;
    public static volatile ListAttribute<MoodboardEntity, ScreenshotEntity> screenshots;

}