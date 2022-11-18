// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class RevokeInstanceFromCbnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RevokeInstanceFromCbnResponseBody body;

    public static RevokeInstanceFromCbnResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeInstanceFromCbnResponse self = new RevokeInstanceFromCbnResponse();
        return TeaModel.build(map, self);
    }

    public RevokeInstanceFromCbnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeInstanceFromCbnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeInstanceFromCbnResponse setBody(RevokeInstanceFromCbnResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeInstanceFromCbnResponseBody getBody() {
        return this.body;
    }

}
