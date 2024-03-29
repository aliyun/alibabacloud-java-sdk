// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_push20220225.models;

import com.aliyun.tea.*;

public class SendByFilterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendByFilterResponseBody body;

    public static SendByFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        SendByFilterResponse self = new SendByFilterResponse();
        return TeaModel.build(map, self);
    }

    public SendByFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendByFilterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendByFilterResponse setBody(SendByFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public SendByFilterResponseBody getBody() {
        return this.body;
    }

}
