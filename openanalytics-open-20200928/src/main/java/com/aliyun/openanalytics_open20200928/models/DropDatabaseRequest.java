// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20200928.models;

import com.aliyun.tea.*;

public class DropDatabaseRequest extends TeaModel {
    // 需要删除的数据库名称
    @NameInMap("Name")
    public String name;

    // 如果设置为ture，那么数据库里面有表会先把表删除，再删除数据库；如果设置为false，那么数据库里面有表则不能删除数据库。
    @NameInMap("Cascade")
    public Boolean cascade;

    public static DropDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DropDatabaseRequest self = new DropDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public DropDatabaseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DropDatabaseRequest setCascade(Boolean cascade) {
        this.cascade = cascade;
        return this;
    }
    public Boolean getCascade() {
        return this.cascade;
    }

}
