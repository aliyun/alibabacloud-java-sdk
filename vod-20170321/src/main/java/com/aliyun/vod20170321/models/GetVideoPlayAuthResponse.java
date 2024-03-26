// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoPlayAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetVideoPlayAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoPlayAuthResponse setBody(GetVideoPlayAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoPlayAuthResponseBody getBody() {
        return this.body;
    }

}
