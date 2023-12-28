// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListDefaultQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDefaultQuotaResponseBody body;

    public static ListDefaultQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDefaultQuotaResponse self = new ListDefaultQuotaResponse();
        return TeaModel.build(map, self);
    }

    public ListDefaultQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDefaultQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDefaultQuotaResponse setBody(ListDefaultQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDefaultQuotaResponseBody getBody() {
        return this.body;
    }

}
