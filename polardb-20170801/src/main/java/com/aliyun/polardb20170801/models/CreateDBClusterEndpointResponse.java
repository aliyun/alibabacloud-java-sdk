// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDBClusterEndpointResponseBody body;

    public static CreateDBClusterEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterEndpointResponse self = new CreateDBClusterEndpointResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBClusterEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBClusterEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDBClusterEndpointResponse setBody(CreateDBClusterEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBClusterEndpointResponseBody getBody() {
        return this.body;
    }

}
