// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetDeploymentArchiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeploymentArchiveResponseBody body;

    public static GetDeploymentArchiveResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentArchiveResponse self = new GetDeploymentArchiveResponse();
        return TeaModel.build(map, self);
    }

    public GetDeploymentArchiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeploymentArchiveResponse setBody(GetDeploymentArchiveResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeploymentArchiveResponseBody getBody() {
        return this.body;
    }

}
