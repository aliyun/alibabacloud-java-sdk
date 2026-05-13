// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class CreateClusterVpcEndpointConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateClusterVpcEndpointConnectionResponseBody body;

    public static CreateClusterVpcEndpointConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterVpcEndpointConnectionResponse self = new CreateClusterVpcEndpointConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateClusterVpcEndpointConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClusterVpcEndpointConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateClusterVpcEndpointConnectionResponse setBody(CreateClusterVpcEndpointConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClusterVpcEndpointConnectionResponseBody getBody() {
        return this.body;
    }

}
