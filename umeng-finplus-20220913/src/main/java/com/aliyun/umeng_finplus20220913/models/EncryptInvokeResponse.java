// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class EncryptInvokeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EncryptInvokeResponseBody body;

    public static EncryptInvokeResponse build(java.util.Map<String, ?> map) throws Exception {
        EncryptInvokeResponse self = new EncryptInvokeResponse();
        return TeaModel.build(map, self);
    }

    public EncryptInvokeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EncryptInvokeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EncryptInvokeResponse setBody(EncryptInvokeResponseBody body) {
        this.body = body;
        return this;
    }
    public EncryptInvokeResponseBody getBody() {
        return this.body;
    }

}
