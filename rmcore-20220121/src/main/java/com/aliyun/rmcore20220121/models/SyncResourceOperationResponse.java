// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class SyncResourceOperationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncResourceOperationResponseBody body;

    public static SyncResourceOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncResourceOperationResponse self = new SyncResourceOperationResponse();
        return TeaModel.build(map, self);
    }

    public SyncResourceOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncResourceOperationResponse setBody(SyncResourceOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncResourceOperationResponseBody getBody() {
        return this.body;
    }

}
