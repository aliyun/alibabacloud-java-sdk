// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class FullSyncResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FullSyncResponseBody body;

    public static FullSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        FullSyncResponse self = new FullSyncResponse();
        return TeaModel.build(map, self);
    }

    public FullSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FullSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FullSyncResponse setBody(FullSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public FullSyncResponseBody getBody() {
        return this.body;
    }

}
