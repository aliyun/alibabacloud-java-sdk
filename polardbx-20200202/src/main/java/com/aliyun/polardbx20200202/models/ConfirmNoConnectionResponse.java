// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ConfirmNoConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmNoConnectionResponseBody body;

    public static ConfirmNoConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmNoConnectionResponse self = new ConfirmNoConnectionResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmNoConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmNoConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmNoConnectionResponse setBody(ConfirmNoConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmNoConnectionResponseBody getBody() {
        return this.body;
    }

}
