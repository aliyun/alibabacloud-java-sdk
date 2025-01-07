// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOperationProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOperationProcessResponseBody body;

    public static ListOperationProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOperationProcessResponse self = new ListOperationProcessResponse();
        return TeaModel.build(map, self);
    }

    public ListOperationProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOperationProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOperationProcessResponse setBody(ListOperationProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOperationProcessResponseBody getBody() {
        return this.body;
    }

}
