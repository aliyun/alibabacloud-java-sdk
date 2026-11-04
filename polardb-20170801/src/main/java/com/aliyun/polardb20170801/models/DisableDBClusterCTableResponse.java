// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DisableDBClusterCTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableDBClusterCTableResponseBody body;

    public static DisableDBClusterCTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDBClusterCTableResponse self = new DisableDBClusterCTableResponse();
        return TeaModel.build(map, self);
    }

    public DisableDBClusterCTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDBClusterCTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDBClusterCTableResponse setBody(DisableDBClusterCTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDBClusterCTableResponseBody getBody() {
        return this.body;
    }

}
