// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStackResourcesResponseBody body;

    public static ListStackResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackResourcesResponse self = new ListStackResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListStackResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStackResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStackResourcesResponse setBody(ListStackResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStackResourcesResponseBody getBody() {
        return this.body;
    }

}
