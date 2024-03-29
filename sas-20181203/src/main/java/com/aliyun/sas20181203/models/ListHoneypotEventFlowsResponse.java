// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotEventFlowsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHoneypotEventFlowsResponseBody body;

    public static ListHoneypotEventFlowsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotEventFlowsResponse self = new ListHoneypotEventFlowsResponse();
        return TeaModel.build(map, self);
    }

    public ListHoneypotEventFlowsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHoneypotEventFlowsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHoneypotEventFlowsResponse setBody(ListHoneypotEventFlowsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHoneypotEventFlowsResponseBody getBody() {
        return this.body;
    }

}
