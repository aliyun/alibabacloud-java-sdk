// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class BindSerialNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BindSerialNumberResponseBody body;

    public static BindSerialNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        BindSerialNumberResponse self = new BindSerialNumberResponse();
        return TeaModel.build(map, self);
    }

    public BindSerialNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindSerialNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindSerialNumberResponse setBody(BindSerialNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public BindSerialNumberResponseBody getBody() {
        return this.body;
    }

}
