// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHoneypotNodeResponseBody body;

    public static ListHoneypotNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotNodeResponse self = new ListHoneypotNodeResponse();
        return TeaModel.build(map, self);
    }

    public ListHoneypotNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHoneypotNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHoneypotNodeResponse setBody(ListHoneypotNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHoneypotNodeResponseBody getBody() {
        return this.body;
    }

}
