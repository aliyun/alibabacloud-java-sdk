// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SyncTrademarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncTrademarkResponseBody body;

    public static SyncTrademarkResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncTrademarkResponse self = new SyncTrademarkResponse();
        return TeaModel.build(map, self);
    }

    public SyncTrademarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncTrademarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncTrademarkResponse setBody(SyncTrademarkResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncTrademarkResponseBody getBody() {
        return this.body;
    }

}
