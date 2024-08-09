// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class Database extends TeaModel {
    @NameInMap("comment")
    public String comment;

    @NameInMap("name")
    public String name;

    @NameInMap("properties")
    public java.util.Map<String, ?> properties;

    public static Database build(java.util.Map<String, ?> map) throws Exception {
        Database self = new Database();
        return TeaModel.build(map, self);
    }

    public Database setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Database setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Database setProperties(java.util.Map<String, ?> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.Map<String, ?> getProperties() {
        return this.properties;
    }

}
