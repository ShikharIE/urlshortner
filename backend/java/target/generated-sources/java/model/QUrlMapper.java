package model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUrlMapper is a Querydsl query type for UrlMapper
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUrlMapper extends EntityPathBase<UrlMapper> {

    private static final long serialVersionUID = 1922674667L;

    public static final QUrlMapper urlMapper = new QUrlMapper("urlMapper");

    public final StringPath createdOn = createString("createdOn");

    public final StringPath longUrl = createString("longUrl");

    public final StringPath meta = createString("meta");

    public final StringPath shortUrl = createString("shortUrl");

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public QUrlMapper(String variable) {
        super(UrlMapper.class, forVariable(variable));
    }

    public QUrlMapper(Path<? extends UrlMapper> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUrlMapper(PathMetadata metadata) {
        super(UrlMapper.class, metadata);
    }

}

