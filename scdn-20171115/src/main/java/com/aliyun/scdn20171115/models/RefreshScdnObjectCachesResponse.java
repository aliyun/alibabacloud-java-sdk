// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scdn20171115.models;

import com.aliyun.tea.*;

public class RefreshScdnObjectCachesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshScdnObjectCachesResponseBody body;

    public static RefreshScdnObjectCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshScdnObjectCachesResponse self = new RefreshScdnObjectCachesResponse();
        return TeaModel.build(map, self);
    }

    public RefreshScdnObjectCachesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshScdnObjectCachesResponse setBody(RefreshScdnObjectCachesResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshScdnObjectCachesResponseBody getBody() {
        return this.body;
    }

}
