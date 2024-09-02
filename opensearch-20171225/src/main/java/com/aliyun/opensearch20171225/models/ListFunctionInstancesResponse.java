// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListFunctionInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFunctionInstancesResponseBody body;

    public static ListFunctionInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionInstancesResponse self = new ListFunctionInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListFunctionInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFunctionInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFunctionInstancesResponse setBody(ListFunctionInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFunctionInstancesResponseBody getBody() {
        return this.body;
    }

}
