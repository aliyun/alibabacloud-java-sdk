// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshContainerAssetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshContainerAssetsResponseBody body;

    public static RefreshContainerAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshContainerAssetsResponse self = new RefreshContainerAssetsResponse();
        return TeaModel.build(map, self);
    }

    public RefreshContainerAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshContainerAssetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshContainerAssetsResponse setBody(RefreshContainerAssetsResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshContainerAssetsResponseBody getBody() {
        return this.body;
    }

}
