// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshVodObjectCachesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshVodObjectCachesResponseBody body;

    public static RefreshVodObjectCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshVodObjectCachesResponse self = new RefreshVodObjectCachesResponse();
        return TeaModel.build(map, self);
    }

    public RefreshVodObjectCachesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshVodObjectCachesResponse setBody(RefreshVodObjectCachesResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshVodObjectCachesResponseBody getBody() {
        return this.body;
    }

}
