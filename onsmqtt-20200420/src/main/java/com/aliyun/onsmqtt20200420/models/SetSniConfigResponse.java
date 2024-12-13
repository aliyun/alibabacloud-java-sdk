// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class SetSniConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetSniConfigResponseBody body;

    public static SetSniConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSniConfigResponse self = new SetSniConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetSniConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSniConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSniConfigResponse setBody(SetSniConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSniConfigResponseBody getBody() {
        return this.body;
    }

}
