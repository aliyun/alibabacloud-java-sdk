// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class ListSlotsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSlotsResponseBody body;

    public static ListSlotsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSlotsResponse self = new ListSlotsResponse();
        return TeaModel.build(map, self);
    }

    public ListSlotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSlotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSlotsResponse setBody(ListSlotsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSlotsResponseBody getBody() {
        return this.body;
    }

}
