// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class OnlineModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OnlineModelResponseBody body;

    public static OnlineModelResponse build(java.util.Map<String, ?> map) throws Exception {
        OnlineModelResponse self = new OnlineModelResponse();
        return TeaModel.build(map, self);
    }

    public OnlineModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnlineModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnlineModelResponse setBody(OnlineModelResponseBody body) {
        this.body = body;
        return this;
    }
    public OnlineModelResponseBody getBody() {
        return this.body;
    }

}
