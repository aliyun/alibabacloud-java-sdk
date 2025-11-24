// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetDeploymentBySelectorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeploymentBySelectorResponseBody body;

    public static GetDeploymentBySelectorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeploymentBySelectorResponse self = new GetDeploymentBySelectorResponse();
        return TeaModel.build(map, self);
    }

    public GetDeploymentBySelectorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeploymentBySelectorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeploymentBySelectorResponse setBody(GetDeploymentBySelectorResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeploymentBySelectorResponseBody getBody() {
        return this.body;
    }

}
