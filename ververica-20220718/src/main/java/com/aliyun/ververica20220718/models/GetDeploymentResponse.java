// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetDeploymentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeploymentResponseBody body;

    public static GetDeploymentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentResponse self = new GetDeploymentResponse();
        return TeaModel.build(map, self);
    }

    public GetDeploymentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeploymentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeploymentResponse setBody(GetDeploymentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeploymentResponseBody getBody() {
        return this.body;
    }

}
