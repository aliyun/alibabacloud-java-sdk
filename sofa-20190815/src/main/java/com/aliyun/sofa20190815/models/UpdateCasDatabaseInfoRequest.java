// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateCasDatabaseInfoRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public String id;

    @NameInMap("Name")
    public String name;

    public static UpdateCasDatabaseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCasDatabaseInfoRequest self = new UpdateCasDatabaseInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCasDatabaseInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCasDatabaseInfoRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateCasDatabaseInfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
