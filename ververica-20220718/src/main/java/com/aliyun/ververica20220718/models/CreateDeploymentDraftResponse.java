// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateDeploymentDraftResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDeploymentDraftResponseBody body;

    public static CreateDeploymentDraftResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeploymentDraftResponse self = new CreateDeploymentDraftResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeploymentDraftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeploymentDraftResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDeploymentDraftResponse setBody(CreateDeploymentDraftResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeploymentDraftResponseBody getBody() {
        return this.body;
    }

}
