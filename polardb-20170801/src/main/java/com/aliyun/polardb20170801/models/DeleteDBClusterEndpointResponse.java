// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDBClusterEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDBClusterEndpointResponseBody body;

    public static DeleteDBClusterEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBClusterEndpointResponse self = new DeleteDBClusterEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBClusterEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBClusterEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDBClusterEndpointResponse setBody(DeleteDBClusterEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBClusterEndpointResponseBody getBody() {
        return this.body;
    }

}
