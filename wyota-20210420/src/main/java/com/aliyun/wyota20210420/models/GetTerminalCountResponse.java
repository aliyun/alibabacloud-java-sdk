// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetTerminalCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTerminalCountResponseBody body;

    public static GetTerminalCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTerminalCountResponse self = new GetTerminalCountResponse();
        return TeaModel.build(map, self);
    }

    public GetTerminalCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTerminalCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTerminalCountResponse setBody(GetTerminalCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTerminalCountResponseBody getBody() {
        return this.body;
    }

}
