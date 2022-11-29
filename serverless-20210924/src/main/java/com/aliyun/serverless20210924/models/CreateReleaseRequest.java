// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class CreateReleaseRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    public static CreateReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReleaseRequest self = new CreateReleaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateReleaseRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
