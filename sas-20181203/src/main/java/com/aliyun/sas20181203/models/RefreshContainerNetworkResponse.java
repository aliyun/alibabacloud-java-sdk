// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RefreshContainerNetworkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshContainerNetworkResponseBody body;

    public static RefreshContainerNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshContainerNetworkResponse self = new RefreshContainerNetworkResponse();
        return TeaModel.build(map, self);
    }

    public RefreshContainerNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshContainerNetworkResponse setBody(RefreshContainerNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshContainerNetworkResponseBody getBody() {
        return this.body;
    }

}
