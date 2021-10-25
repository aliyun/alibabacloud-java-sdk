// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201027.models;

import com.aliyun.tea.*;

public class CopyStoresResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CopyStoresResponseBody body;

    public static CopyStoresResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyStoresResponse self = new CopyStoresResponse();
        return TeaModel.build(map, self);
    }

    public CopyStoresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyStoresResponse setBody(CopyStoresResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyStoresResponseBody getBody() {
        return this.body;
    }

}
