// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class TunnelSendResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TunnelSendResponseBody body;

    public static TunnelSendResponse build(java.util.Map<String, ?> map) throws Exception {
        TunnelSendResponse self = new TunnelSendResponse();
        return TeaModel.build(map, self);
    }

    public TunnelSendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TunnelSendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TunnelSendResponse setBody(TunnelSendResponseBody body) {
        this.body = body;
        return this;
    }
    public TunnelSendResponseBody getBody() {
        return this.body;
    }

}
