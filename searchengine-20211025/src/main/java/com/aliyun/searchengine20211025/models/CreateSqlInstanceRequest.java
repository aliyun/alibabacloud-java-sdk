// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateSqlInstanceRequest extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("parent")
    public Long parent;

    public static CreateSqlInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlInstanceRequest self = new CreateSqlInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateSqlInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSqlInstanceRequest setParent(Long parent) {
        this.parent = parent;
        return this;
    }
    public Long getParent() {
        return this.parent;
    }

}
