// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa20230417.models;

import com.aliyun.tea.*;

public class SyncCardInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncCardInfoResponseBody body;

    public static SyncCardInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncCardInfoResponse self = new SyncCardInfoResponse();
        return TeaModel.build(map, self);
    }

    public SyncCardInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncCardInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncCardInfoResponse setBody(SyncCardInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncCardInfoResponseBody getBody() {
        return this.body;
    }

}
