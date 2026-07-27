// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ResetInstanceKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetInstanceKeysResponseBody body;

    public static ResetInstanceKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetInstanceKeysResponse self = new ResetInstanceKeysResponse();
        return TeaModel.build(map, self);
    }

    public ResetInstanceKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetInstanceKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetInstanceKeysResponse setBody(ResetInstanceKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetInstanceKeysResponseBody getBody() {
        return this.body;
    }

}
