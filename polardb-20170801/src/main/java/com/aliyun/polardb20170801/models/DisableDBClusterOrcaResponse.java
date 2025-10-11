// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DisableDBClusterOrcaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableDBClusterOrcaResponseBody body;

    public static DisableDBClusterOrcaResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDBClusterOrcaResponse self = new DisableDBClusterOrcaResponse();
        return TeaModel.build(map, self);
    }

    public DisableDBClusterOrcaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDBClusterOrcaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDBClusterOrcaResponse setBody(DisableDBClusterOrcaResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDBClusterOrcaResponseBody getBody() {
        return this.body;
    }

}
