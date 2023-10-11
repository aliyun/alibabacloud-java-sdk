// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class SubmitLongTtsTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitLongTtsTaskResponseBody body;

    public static SubmitLongTtsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitLongTtsTaskResponse self = new SubmitLongTtsTaskResponse();
        return TeaModel.build(map, self);
    }

    public SubmitLongTtsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitLongTtsTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitLongTtsTaskResponse setBody(SubmitLongTtsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitLongTtsTaskResponseBody getBody() {
        return this.body;
    }

}
