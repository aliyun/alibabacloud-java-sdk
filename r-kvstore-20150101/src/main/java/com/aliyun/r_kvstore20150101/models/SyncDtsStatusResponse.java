// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class SyncDtsStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SyncDtsStatusResponseBody body;

    public static SyncDtsStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncDtsStatusResponse self = new SyncDtsStatusResponse();
        return TeaModel.build(map, self);
    }

    public SyncDtsStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncDtsStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncDtsStatusResponse setBody(SyncDtsStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncDtsStatusResponseBody getBody() {
        return this.body;
    }

}
