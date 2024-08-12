// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateDeploymentDraftResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDeploymentDraftResponseBody body;

    public static UpdateDeploymentDraftResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeploymentDraftResponse self = new UpdateDeploymentDraftResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeploymentDraftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeploymentDraftResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDeploymentDraftResponse setBody(UpdateDeploymentDraftResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeploymentDraftResponseBody getBody() {
        return this.body;
    }

}
