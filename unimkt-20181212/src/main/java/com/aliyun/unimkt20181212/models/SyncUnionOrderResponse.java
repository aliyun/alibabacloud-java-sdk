// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class SyncUnionOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncUnionOrderResponseBody body;

    public static SyncUnionOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncUnionOrderResponse self = new SyncUnionOrderResponse();
        return TeaModel.build(map, self);
    }

    public SyncUnionOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncUnionOrderResponse setBody(SyncUnionOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncUnionOrderResponseBody getBody() {
        return this.body;
    }

}
