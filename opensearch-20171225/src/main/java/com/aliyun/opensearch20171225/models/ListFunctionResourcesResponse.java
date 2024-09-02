// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListFunctionResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFunctionResourcesResponseBody body;

    public static ListFunctionResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionResourcesResponse self = new ListFunctionResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListFunctionResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFunctionResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFunctionResourcesResponse setBody(ListFunctionResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFunctionResourcesResponseBody getBody() {
        return this.body;
    }

}
