// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class SignalResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SignalResourceResponseBody body;

    public static SignalResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SignalResourceResponse self = new SignalResourceResponse();
        return TeaModel.build(map, self);
    }

    public SignalResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SignalResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SignalResourceResponse setBody(SignalResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SignalResourceResponseBody getBody() {
        return this.body;
    }

}
