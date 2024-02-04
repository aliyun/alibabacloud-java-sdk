// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class FailoverDBClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FailoverDBClusterResponseBody body;

    public static FailoverDBClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        FailoverDBClusterResponse self = new FailoverDBClusterResponse();
        return TeaModel.build(map, self);
    }

    public FailoverDBClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FailoverDBClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FailoverDBClusterResponse setBody(FailoverDBClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public FailoverDBClusterResponseBody getBody() {
        return this.body;
    }

}
