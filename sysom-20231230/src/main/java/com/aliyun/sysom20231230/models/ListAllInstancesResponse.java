// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class ListAllInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAllInstancesResponseBody body;

    public static ListAllInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllInstancesResponse self = new ListAllInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListAllInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllInstancesResponse setBody(ListAllInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllInstancesResponseBody getBody() {
        return this.body;
    }

}
