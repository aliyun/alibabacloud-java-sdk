// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshAssetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshAssetsResponseBody body;

    public static RefreshAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshAssetsResponse self = new RefreshAssetsResponse();
        return TeaModel.build(map, self);
    }

    public RefreshAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshAssetsResponse setBody(RefreshAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshAssetsResponseBody getBody() {
        return this.body;
    }

}
