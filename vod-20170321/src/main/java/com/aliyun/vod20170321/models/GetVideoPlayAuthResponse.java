// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoPlayAuthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVideoPlayAuthResponseBody body;

    public static GetVideoPlayAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPlayAuthResponse self = new GetVideoPlayAuthResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoPlayAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoPlayAuthResponse setBody(GetVideoPlayAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoPlayAuthResponseBody getBody() {
        return this.body;
    }

}
