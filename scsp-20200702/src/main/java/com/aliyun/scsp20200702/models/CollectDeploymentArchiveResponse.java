// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class CollectDeploymentArchiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CollectDeploymentArchiveResponseBody body;

    public static CollectDeploymentArchiveResponse build(java.util.Map<String, ?> map) throws Exception {
        CollectDeploymentArchiveResponse self = new CollectDeploymentArchiveResponse();
        return TeaModel.build(map, self);
    }

    public CollectDeploymentArchiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CollectDeploymentArchiveResponse setBody(CollectDeploymentArchiveResponseBody body) {
        this.body = body;
        return this;
    }
    public CollectDeploymentArchiveResponseBody getBody() {
        return this.body;
    }

}
