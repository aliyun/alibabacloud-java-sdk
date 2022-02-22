// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RefreshProxyLevelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshProxyLevelResponseBody body;

    public static RefreshProxyLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshProxyLevelResponse self = new RefreshProxyLevelResponse();
        return TeaModel.build(map, self);
    }

    public RefreshProxyLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshProxyLevelResponse setBody(RefreshProxyLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshProxyLevelResponseBody getBody() {
        return this.body;
    }

}
