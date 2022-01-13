// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class PutServiceRequest extends TeaModel {
    // A service for serverless deployments
    @NameInMap("body")
    public Service body;

    public static PutServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        PutServiceRequest self = new PutServiceRequest();
        return TeaModel.build(map, self);
    }

    public PutServiceRequest setBody(Service body) {
        this.body = body;
        return this;
    }
    public Service getBody() {
        return this.body;
    }

}
