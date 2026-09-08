// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class SyncDataAssetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncDataAssetsResponseBody body;

    public static SyncDataAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncDataAssetsResponse self = new SyncDataAssetsResponse();
        return TeaModel.build(map, self);
    }

    public SyncDataAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncDataAssetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncDataAssetsResponse setBody(SyncDataAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncDataAssetsResponseBody getBody() {
        return this.body;
    }

}
