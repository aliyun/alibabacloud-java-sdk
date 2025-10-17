// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDBClusterEndpointZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDBClusterEndpointZonalResponseBody body;

    public static DeleteDBClusterEndpointZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBClusterEndpointZonalResponse self = new DeleteDBClusterEndpointZonalResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBClusterEndpointZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBClusterEndpointZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDBClusterEndpointZonalResponse setBody(DeleteDBClusterEndpointZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBClusterEndpointZonalResponseBody getBody() {
        return this.body;
    }

}
