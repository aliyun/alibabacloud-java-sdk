// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVideoInfoResponseBody body;

    public static GetVideoInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoInfoResponse self = new GetVideoInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoInfoResponse setBody(GetVideoInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoInfoResponseBody getBody() {
        return this.body;
    }

}
