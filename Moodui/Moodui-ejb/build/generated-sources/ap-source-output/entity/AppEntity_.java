package entity;

import entity.CategoryEntity;
import entity.CommentEntity;
import entity.ScreenshotEntity;
import entity.UserEntity;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-03T21:41:02")
@StaticMetamodel(AppEntity.class)
public class AppEntity_ { 

    public static volatile SingularAttribute<AppEntity, Date> dateCreated;
    public static volatile ListAttribute<AppEntity, CommentEntity> comments;
    public static volatile SingularAttribute<AppEntity, Long> appId;
    public static volatile SingularAttribute<AppEntity, String> name;
    public static volatile SingularAttribute<AppEntity, String> description;
    public static volatile SingularAttribute<AppEntity, Boolean> isPublic;
    public static volatile SingularAttribute<AppEntity, String> logo;
    public static volatile ListAttribute<AppEntity, CategoryEntity> categories;
    public static volatile SingularAttribute<AppEntity, UserEntity> poster;
    public static volatile ListAttribute<AppEntity, ScreenshotEntity> screenshots;

}