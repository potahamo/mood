package entity;

import entity.AppEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-03T21:41:02")
@StaticMetamodel(CategoryEntity.class)
public class CategoryEntity_ { 

    public static volatile SingularAttribute<CategoryEntity, String> name;
    public static volatile SingularAttribute<CategoryEntity, Long> categoryId;
    public static volatile ListAttribute<CategoryEntity, AppEntity> apps;

}