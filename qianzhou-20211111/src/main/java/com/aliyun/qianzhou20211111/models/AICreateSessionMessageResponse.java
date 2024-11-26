// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class AICreateSessionMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AICreateSessionMessageResponseBody body;

    public static AICreateSessionMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        AICreateSessionMessageResponse self = new AICreateSessionMessageResponse();
        return TeaModel.build(map, self);
    }

    public AICreateSessionMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AICreateSessionMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AICreateSessionMessageResponse setBody(AICreateSessionMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public AICreateSessionMessageResponseBody getBody() {
        return this.body;
    }

}
