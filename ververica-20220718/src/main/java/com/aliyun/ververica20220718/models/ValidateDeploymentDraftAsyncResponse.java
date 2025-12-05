// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ValidateDeploymentDraftAsyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateDeploymentDraftAsyncResponseBody body;

    public static ValidateDeploymentDraftAsyncResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateDeploymentDraftAsyncResponse self = new ValidateDeploymentDraftAsyncResponse();
        return TeaModel.build(map, self);
    }

    public ValidateDeploymentDraftAsyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateDeploymentDraftAsyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateDeploymentDraftAsyncResponse setBody(ValidateDeploymentDraftAsyncResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateDeploymentDraftAsyncResponseBody getBody() {
        return this.body;
    }

}
