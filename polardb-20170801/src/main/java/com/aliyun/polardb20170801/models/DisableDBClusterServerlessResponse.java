// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DisableDBClusterServerlessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableDBClusterServerlessResponseBody body;

    public static DisableDBClusterServerlessResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDBClusterServerlessResponse self = new DisableDBClusterServerlessResponse();
        return TeaModel.build(map, self);
    }

    public DisableDBClusterServerlessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDBClusterServerlessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDBClusterServerlessResponse setBody(DisableDBClusterServerlessResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDBClusterServerlessResponseBody getBody() {
        return this.body;
    }

}
