// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class SyncSensitiveWordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncSensitiveWordResponseBody body;

    public static SyncSensitiveWordResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncSensitiveWordResponse self = new SyncSensitiveWordResponse();
        return TeaModel.build(map, self);
    }

    public SyncSensitiveWordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncSensitiveWordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncSensitiveWordResponse setBody(SyncSensitiveWordResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncSensitiveWordResponseBody getBody() {
        return this.body;
    }

}
