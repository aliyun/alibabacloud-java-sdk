// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListOperationTicketsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListOperationTicketsResponseBody body;

    public static ListOperationTicketsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOperationTicketsResponse self = new ListOperationTicketsResponse();
        return TeaModel.build(map, self);
    }

    public ListOperationTicketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOperationTicketsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOperationTicketsResponse setBody(ListOperationTicketsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOperationTicketsResponseBody getBody() {
        return this.body;
    }

}
