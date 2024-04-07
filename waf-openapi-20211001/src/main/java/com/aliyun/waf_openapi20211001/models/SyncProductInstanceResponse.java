// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class SyncProductInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncProductInstanceResponseBody body;

    public static SyncProductInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncProductInstanceResponse self = new SyncProductInstanceResponse();
        return TeaModel.build(map, self);
    }

    public SyncProductInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncProductInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncProductInstanceResponse setBody(SyncProductInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncProductInstanceResponseBody getBody() {
        return this.body;
    }

}
