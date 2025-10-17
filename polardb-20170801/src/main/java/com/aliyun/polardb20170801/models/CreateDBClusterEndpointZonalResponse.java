// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBClusterEndpointZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDBClusterEndpointZonalResponseBody body;

    public static CreateDBClusterEndpointZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBClusterEndpointZonalResponse self = new CreateDBClusterEndpointZonalResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBClusterEndpointZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBClusterEndpointZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDBClusterEndpointZonalResponse setBody(CreateDBClusterEndpointZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBClusterEndpointZonalResponseBody getBody() {
        return this.body;
    }

}
