// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class PutEnvironmentRequest extends TeaModel {
    // An environment for serverless deployments
    @NameInMap("body")
    public Environment body;

    public static PutEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        PutEnvironmentRequest self = new PutEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public PutEnvironmentRequest setBody(Environment body) {
        this.body = body;
        return this;
    }
    public Environment getBody() {
        return this.body;
    }

}
