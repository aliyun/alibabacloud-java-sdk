// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncHasBaselineSyncfortenantResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncHasBaselineSyncfortenantResponseBody body;

    public static SyncHasBaselineSyncfortenantResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncHasBaselineSyncfortenantResponse self = new SyncHasBaselineSyncfortenantResponse();
        return TeaModel.build(map, self);
    }

    public SyncHasBaselineSyncfortenantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncHasBaselineSyncfortenantResponse setBody(SyncHasBaselineSyncfortenantResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncHasBaselineSyncfortenantResponseBody getBody() {
        return this.body;
    }

}
