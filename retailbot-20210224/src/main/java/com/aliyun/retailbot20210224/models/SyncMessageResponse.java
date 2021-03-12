// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class SyncMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncMessageResponseBody body;

    public static SyncMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncMessageResponse self = new SyncMessageResponse();
        return TeaModel.build(map, self);
    }

    public SyncMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncMessageResponse setBody(SyncMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncMessageResponseBody getBody() {
        return this.body;
    }

}
