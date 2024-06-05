// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListDeltaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDeltaResponseBody body;

    public static ListDeltaResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeltaResponse self = new ListDeltaResponse();
        return TeaModel.build(map, self);
    }

    public ListDeltaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeltaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeltaResponse setBody(ListDeltaResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeltaResponseBody getBody() {
        return this.body;
    }

}
