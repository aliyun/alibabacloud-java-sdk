// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UnbindSerialNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindSerialNumberResponseBody body;

    public static UnbindSerialNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindSerialNumberResponse self = new UnbindSerialNumberResponse();
        return TeaModel.build(map, self);
    }

    public UnbindSerialNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindSerialNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindSerialNumberResponse setBody(UnbindSerialNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindSerialNumberResponseBody getBody() {
        return this.body;
    }

}
