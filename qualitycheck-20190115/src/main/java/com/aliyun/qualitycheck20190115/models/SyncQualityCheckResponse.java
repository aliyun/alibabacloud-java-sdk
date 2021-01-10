// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SyncQualityCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncQualityCheckResponseBody body;

    public static SyncQualityCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncQualityCheckResponse self = new SyncQualityCheckResponse();
        return TeaModel.build(map, self);
    }

    public SyncQualityCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncQualityCheckResponse setBody(SyncQualityCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncQualityCheckResponseBody getBody() {
        return this.body;
    }

}
