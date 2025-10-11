// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class EnableDBClusterOrcaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableDBClusterOrcaResponseBody body;

    public static EnableDBClusterOrcaResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDBClusterOrcaResponse self = new EnableDBClusterOrcaResponse();
        return TeaModel.build(map, self);
    }

    public EnableDBClusterOrcaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDBClusterOrcaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableDBClusterOrcaResponse setBody(EnableDBClusterOrcaResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDBClusterOrcaResponseBody getBody() {
        return this.body;
    }

}
