// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class RefreshMediaPlayUrlsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshMediaPlayUrlsResponseBody body;

    public static RefreshMediaPlayUrlsResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshMediaPlayUrlsResponse self = new RefreshMediaPlayUrlsResponse();
        return TeaModel.build(map, self);
    }

    public RefreshMediaPlayUrlsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshMediaPlayUrlsResponse setBody(RefreshMediaPlayUrlsResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshMediaPlayUrlsResponseBody getBody() {
        return this.body;
    }

}
