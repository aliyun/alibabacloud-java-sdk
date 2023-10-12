// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnableDBClusterServerlessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableDBClusterServerlessResponseBody body;

    public static EnableDBClusterServerlessResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDBClusterServerlessResponse self = new EnableDBClusterServerlessResponse();
        return TeaModel.build(map, self);
    }

    public EnableDBClusterServerlessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDBClusterServerlessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableDBClusterServerlessResponse setBody(EnableDBClusterServerlessResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDBClusterServerlessResponseBody getBody() {
        return this.body;
    }

}
