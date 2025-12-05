// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetAppPlayKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAppPlayKeyResponseBody body;

    public static SetAppPlayKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAppPlayKeyResponse self = new SetAppPlayKeyResponse();
        return TeaModel.build(map, self);
    }

    public SetAppPlayKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAppPlayKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAppPlayKeyResponse setBody(SetAppPlayKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAppPlayKeyResponseBody getBody() {
        return this.body;
    }

}
