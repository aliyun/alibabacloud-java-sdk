// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class SyncApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncApiResponseBody body;

    public static SyncApiResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncApiResponse self = new SyncApiResponse();
        return TeaModel.build(map, self);
    }

    public SyncApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncApiResponse setBody(SyncApiResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncApiResponseBody getBody() {
        return this.body;
    }

}
