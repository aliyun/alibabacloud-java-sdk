// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotAttackerSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHoneypotAttackerSourceResponseBody body;

    public static ListHoneypotAttackerSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotAttackerSourceResponse self = new ListHoneypotAttackerSourceResponse();
        return TeaModel.build(map, self);
    }

    public ListHoneypotAttackerSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHoneypotAttackerSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHoneypotAttackerSourceResponse setBody(ListHoneypotAttackerSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHoneypotAttackerSourceResponseBody getBody() {
        return this.body;
    }

}
