// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOperationProcessDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOperationProcessDetailResponseBody body;

    public static ListOperationProcessDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOperationProcessDetailResponse self = new ListOperationProcessDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListOperationProcessDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOperationProcessDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOperationProcessDetailResponse setBody(ListOperationProcessDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOperationProcessDetailResponseBody getBody() {
        return this.body;
    }

}
