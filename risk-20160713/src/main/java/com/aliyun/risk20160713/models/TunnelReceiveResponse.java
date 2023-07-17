// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class TunnelReceiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TunnelReceiveResponseBody body;

    public static TunnelReceiveResponse build(java.util.Map<String, ?> map) throws Exception {
        TunnelReceiveResponse self = new TunnelReceiveResponse();
        return TeaModel.build(map, self);
    }

    public TunnelReceiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TunnelReceiveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TunnelReceiveResponse setBody(TunnelReceiveResponseBody body) {
        this.body = body;
        return this;
    }
    public TunnelReceiveResponseBody getBody() {
        return this.body;
    }

}
