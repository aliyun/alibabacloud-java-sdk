// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateCasDatabaseAccountRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Id")
    public String id;

    public static UpdateCasDatabaseAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCasDatabaseAccountRequest self = new UpdateCasDatabaseAccountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCasDatabaseAccountRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateCasDatabaseAccountRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
