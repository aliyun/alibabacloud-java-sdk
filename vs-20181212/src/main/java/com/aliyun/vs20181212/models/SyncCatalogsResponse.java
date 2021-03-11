// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class SyncCatalogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncCatalogsResponseBody body;

    public static SyncCatalogsResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncCatalogsResponse self = new SyncCatalogsResponse();
        return TeaModel.build(map, self);
    }

    public SyncCatalogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncCatalogsResponse setBody(SyncCatalogsResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncCatalogsResponseBody getBody() {
        return this.body;
    }

}
