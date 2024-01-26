// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20150801.models;

import com.aliyun.tea.*;

public class SendWangWangResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendWangWangResponseBody body;

    public static SendWangWangResponse build(java.util.Map<String, ?> map) throws Exception {
        SendWangWangResponse self = new SendWangWangResponse();
        return TeaModel.build(map, self);
    }

    public SendWangWangResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendWangWangResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendWangWangResponse setBody(SendWangWangResponseBody body) {
        this.body = body;
        return this;
    }
    public SendWangWangResponseBody getBody() {
        return this.body;
    }

}
