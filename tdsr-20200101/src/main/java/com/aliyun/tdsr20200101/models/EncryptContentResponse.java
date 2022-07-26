// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class EncryptContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EncryptContentResponseBody body;

    public static EncryptContentResponse build(java.util.Map<String, ?> map) throws Exception {
        EncryptContentResponse self = new EncryptContentResponse();
        return TeaModel.build(map, self);
    }

    public EncryptContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EncryptContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EncryptContentResponse setBody(EncryptContentResponseBody body) {
        this.body = body;
        return this;
    }
    public EncryptContentResponseBody getBody() {
        return this.body;
    }

}
