// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class IncrementSyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public IncrementSyncResponseBody body;

    public static IncrementSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        IncrementSyncResponse self = new IncrementSyncResponse();
        return TeaModel.build(map, self);
    }

    public IncrementSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IncrementSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IncrementSyncResponse setBody(IncrementSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public IncrementSyncResponseBody getBody() {
        return this.body;
    }

}
