// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class ListTerminalsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTerminalsResponseBody body;

    public static ListTerminalsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTerminalsResponse self = new ListTerminalsResponse();
        return TeaModel.build(map, self);
    }

    public ListTerminalsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTerminalsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTerminalsResponse setBody(ListTerminalsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTerminalsResponseBody getBody() {
        return this.body;
    }

}
