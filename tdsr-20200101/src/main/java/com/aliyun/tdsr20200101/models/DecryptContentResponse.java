// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class DecryptContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DecryptContentResponseBody body;

    public static DecryptContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DecryptContentResponse self = new DecryptContentResponse();
        return TeaModel.build(map, self);
    }

    public DecryptContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DecryptContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DecryptContentResponse setBody(DecryptContentResponseBody body) {
        this.body = body;
        return this;
    }
    public DecryptContentResponseBody getBody() {
        return this.body;
    }

}
