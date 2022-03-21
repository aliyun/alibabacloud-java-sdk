// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class SyncApiRamMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncApiRamMetaResponseBody body;

    public static SyncApiRamMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncApiRamMetaResponse self = new SyncApiRamMetaResponse();
        return TeaModel.build(map, self);
    }

    public SyncApiRamMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncApiRamMetaResponse setBody(SyncApiRamMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncApiRamMetaResponseBody getBody() {
        return this.body;
    }

}
