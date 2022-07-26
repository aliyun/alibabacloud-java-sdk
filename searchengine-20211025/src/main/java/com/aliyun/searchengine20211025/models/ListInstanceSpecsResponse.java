// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListInstanceSpecsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstanceSpecsResponseBody body;

    public static ListInstanceSpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceSpecsResponse self = new ListInstanceSpecsResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceSpecsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceSpecsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceSpecsResponse setBody(ListInstanceSpecsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceSpecsResponseBody getBody() {
        return this.body;
    }

}
