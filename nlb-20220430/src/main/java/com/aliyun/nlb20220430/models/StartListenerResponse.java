// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class StartListenerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartListenerResponseBody body;

    public static StartListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        StartListenerResponse self = new StartListenerResponse();
        return TeaModel.build(map, self);
    }

    public StartListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartListenerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartListenerResponse setBody(StartListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public StartListenerResponseBody getBody() {
        return this.body;
    }

}
