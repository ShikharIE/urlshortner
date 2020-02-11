package model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QVendor is a Querydsl query type for Vendor
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QVendor extends EntityPathBase<Vendor> {

    private static final long serialVersionUID = -1369568307L;

    public static final QVendor vendor = new QVendor("vendor");

    public final StringPath apiKey = createString("apiKey");

    public final StringPath apiSecret = createString("apiSecret");

    public final StringPath createdOn = createString("createdOn");

    public final StringPath email = createString("email");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath lastLogin = createString("lastLogin");

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public QVendor(String variable) {
        super(Vendor.class, forVariable(variable));
    }

    public QVendor(Path<? extends Vendor> path) {
        super(path.getType(), path.getMetadata());
    }

    public QVendor(PathMetadata metadata) {
        super(Vendor.class, metadata);
    }

}

