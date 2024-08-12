// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteDeploymentDraftResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDeploymentDraftResponseBody body;

    public static DeleteDeploymentDraftResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentDraftResponse self = new DeleteDeploymentDraftResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentDraftResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDeploymentDraftResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDeploymentDraftResponse setBody(DeleteDeploymentDraftResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDeploymentDraftResponseBody getBody() {
        return this.body;
    }

}
