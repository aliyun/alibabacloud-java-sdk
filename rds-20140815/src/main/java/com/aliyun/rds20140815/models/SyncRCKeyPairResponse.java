// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SyncRCKeyPairResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncRCKeyPairResponseBody body;

    public static SyncRCKeyPairResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncRCKeyPairResponse self = new SyncRCKeyPairResponse();
        return TeaModel.build(map, self);
    }

    public SyncRCKeyPairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncRCKeyPairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncRCKeyPairResponse setBody(SyncRCKeyPairResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncRCKeyPairResponseBody getBody() {
        return this.body;
    }

}
