// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class CreateReleaseRequest extends TeaModel {
    @NameInMap("body")
    public Release body;

    public static CreateReleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReleaseRequest self = new CreateReleaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateReleaseRequest setBody(Release body) {
        this.body = body;
        return this;
    }
    public Release getBody() {
        return this.body;
    }

}
