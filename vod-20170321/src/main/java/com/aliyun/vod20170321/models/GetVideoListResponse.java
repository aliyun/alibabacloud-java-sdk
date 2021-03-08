// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVideoListResponseBody body;

    public static GetVideoListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoListResponse self = new GetVideoListResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoListResponse setBody(GetVideoListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoListResponseBody getBody() {
        return this.body;
    }

}
