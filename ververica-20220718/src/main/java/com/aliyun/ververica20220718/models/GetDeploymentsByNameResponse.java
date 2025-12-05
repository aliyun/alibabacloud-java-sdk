// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetDeploymentsByNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeploymentsByNameResponseBody body;

    public static GetDeploymentsByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentsByNameResponse self = new GetDeploymentsByNameResponse();
        return TeaModel.build(map, self);
    }

    public GetDeploymentsByNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeploymentsByNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeploymentsByNameResponse setBody(GetDeploymentsByNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeploymentsByNameResponseBody getBody() {
        return this.body;
    }

}
