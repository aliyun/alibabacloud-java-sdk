// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class PreloadVodObjectCachesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PreloadVodObjectCachesResponseBody body;

    public static PreloadVodObjectCachesResponse build(java.util.Map<String, ?> map) throws Exception {
        PreloadVodObjectCachesResponse self = new PreloadVodObjectCachesResponse();
        return TeaModel.build(map, self);
    }

    public PreloadVodObjectCachesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreloadVodObjectCachesResponse setBody(PreloadVodObjectCachesResponseBody body) {
        this.body = body;
        return this;
    }
    public PreloadVodObjectCachesResponseBody getBody() {
        return this.body;
    }

}
