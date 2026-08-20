// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20260603.models;

import com.aliyun.tea.*;

public class GetModelDeploymentSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetModelDeploymentSpecResponseBody body;

    public static GetModelDeploymentSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelDeploymentSpecResponse self = new GetModelDeploymentSpecResponse();
        return TeaModel.build(map, self);
    }

    public GetModelDeploymentSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelDeploymentSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelDeploymentSpecResponse setBody(GetModelDeploymentSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelDeploymentSpecResponseBody getBody() {
        return this.body;
    }

}
