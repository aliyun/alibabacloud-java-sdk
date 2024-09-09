// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListTracesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTracesResponseBody body;

    public static ListTracesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTracesResponse self = new ListTracesResponse();
        return TeaModel.build(map, self);
    }

    public ListTracesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTracesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTracesResponse setBody(ListTracesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTracesResponseBody getBody() {
        return this.body;
    }

}
