// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class SyncPodInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SyncPodInfoResponseBody body;

    public static SyncPodInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncPodInfoResponse self = new SyncPodInfoResponse();
        return TeaModel.build(map, self);
    }

    public SyncPodInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncPodInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncPodInfoResponse setBody(SyncPodInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncPodInfoResponseBody getBody() {
        return this.body;
    }

}
