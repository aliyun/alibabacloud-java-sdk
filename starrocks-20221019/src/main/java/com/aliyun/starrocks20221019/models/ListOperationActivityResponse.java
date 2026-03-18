// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ListOperationActivityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOperationActivityResponseBody body;

    public static ListOperationActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOperationActivityResponse self = new ListOperationActivityResponse();
        return TeaModel.build(map, self);
    }

    public ListOperationActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOperationActivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOperationActivityResponse setBody(ListOperationActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOperationActivityResponseBody getBody() {
        return this.body;
    }

}
