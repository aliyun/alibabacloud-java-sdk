// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class GenerateBroadcastNewsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateBroadcastNewsResponseBody body;

    public static GenerateBroadcastNewsResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateBroadcastNewsResponse self = new GenerateBroadcastNewsResponse();
        return TeaModel.build(map, self);
    }

    public GenerateBroadcastNewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateBroadcastNewsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateBroadcastNewsResponse setBody(GenerateBroadcastNewsResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateBroadcastNewsResponseBody getBody() {
        return this.body;
    }

}
