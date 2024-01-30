// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupOperationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStackGroupOperationsResponseBody body;

    public static ListStackGroupOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupOperationsResponse self = new ListStackGroupOperationsResponse();
        return TeaModel.build(map, self);
    }

    public ListStackGroupOperationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStackGroupOperationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStackGroupOperationsResponse setBody(ListStackGroupOperationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStackGroupOperationsResponseBody getBody() {
        return this.body;
    }

}
