// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListStackInstancesResponseBody body;

    public static ListStackInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackInstancesResponse self = new ListStackInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListStackInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStackInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStackInstancesResponse setBody(ListStackInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStackInstancesResponseBody getBody() {
        return this.body;
    }

}
