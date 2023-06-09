// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class FirstRank extends TeaModel {
    @NameInMap("active")
    public Boolean active;

    @NameInMap("description")
    public String description;

    @NameInMap("meta")
    public Object meta;

    @NameInMap("name")
    public String name;

    @NameInMap("type")
    public String type;

    public static FirstRank build(java.util.Map<String, ?> map) throws Exception {
        FirstRank self = new FirstRank();
        return TeaModel.build(map, self);
    }

    public FirstRank setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public FirstRank setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public FirstRank setMeta(Object meta) {
        this.meta = meta;
        return this;
    }
    public Object getMeta() {
        return this.meta;
    }

    public FirstRank setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FirstRank setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
