// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateAppGroupRequest extends TeaModel {
    @NameInMap("body")
    public AppGroup body;

    public static CreateAppGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupRequest self = new CreateAppGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppGroupRequest setBody(AppGroup body) {
        this.body = body;
        return this;
    }
    public AppGroup getBody() {
        return this.body;
    }

}
