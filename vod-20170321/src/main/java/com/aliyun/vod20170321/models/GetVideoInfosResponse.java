// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVideoInfosResponseBody body;

    public static GetVideoInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoInfosResponse self = new GetVideoInfosResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoInfosResponse setBody(GetVideoInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoInfosResponseBody getBody() {
        return this.body;
    }

}
