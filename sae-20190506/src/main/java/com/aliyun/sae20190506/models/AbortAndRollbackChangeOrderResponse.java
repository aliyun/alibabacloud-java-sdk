// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class AbortAndRollbackChangeOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AbortAndRollbackChangeOrderResponseBody body;

    public static AbortAndRollbackChangeOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        AbortAndRollbackChangeOrderResponse self = new AbortAndRollbackChangeOrderResponse();
        return TeaModel.build(map, self);
    }

    public AbortAndRollbackChangeOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbortAndRollbackChangeOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AbortAndRollbackChangeOrderResponse setBody(AbortAndRollbackChangeOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public AbortAndRollbackChangeOrderResponseBody getBody() {
        return this.body;
    }

}
