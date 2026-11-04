// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnableDBClusterCTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableDBClusterCTableResponseBody body;

    public static EnableDBClusterCTableResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDBClusterCTableResponse self = new EnableDBClusterCTableResponse();
        return TeaModel.build(map, self);
    }

    public EnableDBClusterCTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDBClusterCTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableDBClusterCTableResponse setBody(EnableDBClusterCTableResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDBClusterCTableResponseBody getBody() {
        return this.body;
    }

}
