// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetDeploymentDraftLockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeploymentDraftLockResponseBody body;

    public static GetDeploymentDraftLockResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentDraftLockResponse self = new GetDeploymentDraftLockResponse();
        return TeaModel.build(map, self);
    }

    public GetDeploymentDraftLockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeploymentDraftLockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeploymentDraftLockResponse setBody(GetDeploymentDraftLockResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeploymentDraftLockResponseBody getBody() {
        return this.body;
    }

}
