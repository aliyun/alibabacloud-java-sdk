// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RefreshProxyLevelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RefreshProxyLevelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshProxyLevelResponse setBody(RefreshProxyLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshProxyLevelResponseBody getBody() {
        return this.body;
    }

}
