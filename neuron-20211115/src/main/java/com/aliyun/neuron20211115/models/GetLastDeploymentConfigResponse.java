// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetLastDeploymentConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLastDeploymentConfigResponseBody body;

    public static GetLastDeploymentConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLastDeploymentConfigResponse self = new GetLastDeploymentConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetLastDeploymentConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLastDeploymentConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLastDeploymentConfigResponse setBody(GetLastDeploymentConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLastDeploymentConfigResponseBody getBody() {
        return this.body;
    }

}
