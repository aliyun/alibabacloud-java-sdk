// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class SecondRank extends TeaModel {
    @NameInMap("active")
    public Boolean active;

    @NameInMap("description")
    public String description;

    @NameInMap("meta")
    public Object meta;

    @NameInMap("name")
    public String name;

    public static SecondRank build(java.util.Map<String, ?> map) throws Exception {
        SecondRank self = new SecondRank();
        return TeaModel.build(map, self);
    }

    public SecondRank setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public SecondRank setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SecondRank setMeta(Object meta) {
        this.meta = meta;
        return this;
    }
    public Object getMeta() {
        return this.meta;
    }

    public SecondRank setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
