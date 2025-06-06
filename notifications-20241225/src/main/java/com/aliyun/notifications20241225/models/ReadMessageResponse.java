// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadMessageResponseBody body;

    public static ReadMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadMessageResponse self = new ReadMessageResponse();
        return TeaModel.build(map, self);
    }

    public ReadMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadMessageResponse setBody(ReadMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadMessageResponseBody getBody() {
        return this.body;
    }

}
