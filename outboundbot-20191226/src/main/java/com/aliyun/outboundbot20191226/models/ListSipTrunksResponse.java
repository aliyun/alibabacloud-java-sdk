// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListSipTrunksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSipTrunksResponseBody body;

    public static ListSipTrunksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSipTrunksResponse self = new ListSipTrunksResponse();
        return TeaModel.build(map, self);
    }

    public ListSipTrunksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSipTrunksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSipTrunksResponse setBody(ListSipTrunksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSipTrunksResponseBody getBody() {
        return this.body;
    }

}
