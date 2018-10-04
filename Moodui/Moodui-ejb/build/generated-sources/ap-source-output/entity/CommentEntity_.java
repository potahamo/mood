package entity;

import entity.AppEntity;
import entity.ScreenshotEntity;
import entity.UserEntity;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import util.enumeration.CommentType;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-03T21:41:02")
@StaticMetamodel(CommentEntity.class)
public class CommentEntity_ { 

    public static volatile SingularAttribute<CommentEntity, AppEntity> app;
    public static volatile SingularAttribute<CommentEntity, Date> timePosted;
    public static volatile SingularAttribute<CommentEntity, Long> commentId;
    public static volatile SingularAttribute<CommentEntity, String> text;
    public static volatile SingularAttribute<CommentEntity, ScreenshotEntity> screenshot;
    public static volatile SingularAttribute<CommentEntity, CommentType> type;
    public static volatile SingularAttribute<CommentEntity, UserEntity> poster;

}