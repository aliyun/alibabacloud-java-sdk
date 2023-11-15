// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ListTrademarkSbjKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListTrademarkSbjKeyResponseBody body;

    public static ListTrademarkSbjKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTrademarkSbjKeyResponse self = new ListTrademarkSbjKeyResponse();
        return TeaModel.build(map, self);
    }

    public ListTrademarkSbjKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTrademarkSbjKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTrademarkSbjKeyResponse setBody(ListTrademarkSbjKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTrademarkSbjKeyResponseBody getBody() {
        return this.body;
    }

}
