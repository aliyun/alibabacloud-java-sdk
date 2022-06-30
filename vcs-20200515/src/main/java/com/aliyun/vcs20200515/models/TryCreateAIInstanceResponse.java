// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class TryCreateAIInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TryCreateAIInstanceResponseBody body;

    public static TryCreateAIInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        TryCreateAIInstanceResponse self = new TryCreateAIInstanceResponse();
        return TeaModel.build(map, self);
    }

    public TryCreateAIInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TryCreateAIInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TryCreateAIInstanceResponse setBody(TryCreateAIInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public TryCreateAIInstanceResponseBody getBody() {
        return this.body;
    }

}
