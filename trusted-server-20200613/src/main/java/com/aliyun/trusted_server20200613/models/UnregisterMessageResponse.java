// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class UnregisterMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnregisterMessageResponseBody body;

    public static UnregisterMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        UnregisterMessageResponse self = new UnregisterMessageResponse();
        return TeaModel.build(map, self);
    }

    public UnregisterMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnregisterMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnregisterMessageResponse setBody(UnregisterMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public UnregisterMessageResponseBody getBody() {
        return this.body;
    }

}
