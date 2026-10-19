// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListWorkItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkItemsResponseBody body;

    public static ListWorkItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkItemsResponse self = new ListWorkItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkItemsResponse setBody(ListWorkItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkItemsResponseBody getBody() {
        return this.body;
    }

}
