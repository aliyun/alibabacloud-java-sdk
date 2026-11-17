// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DisableOutputItemShareResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableOutputItemShareResponseBody body;

    public static DisableOutputItemShareResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableOutputItemShareResponse self = new DisableOutputItemShareResponse();
        return TeaModel.build(map, self);
    }

    public DisableOutputItemShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableOutputItemShareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableOutputItemShareResponse setBody(DisableOutputItemShareResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableOutputItemShareResponseBody getBody() {
        return this.body;
    }

}
