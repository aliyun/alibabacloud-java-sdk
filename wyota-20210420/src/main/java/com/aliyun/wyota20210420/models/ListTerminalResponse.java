// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListTerminalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTerminalResponseBody body;

    public static ListTerminalResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTerminalResponse self = new ListTerminalResponse();
        return TeaModel.build(map, self);
    }

    public ListTerminalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTerminalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTerminalResponse setBody(ListTerminalResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTerminalResponseBody getBody() {
        return this.body;
    }

}
