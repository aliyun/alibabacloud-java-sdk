// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoPlayInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoPlayInfoResponseBody body;

    public static GetVideoPlayInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPlayInfoResponse self = new GetVideoPlayInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoPlayInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoPlayInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoPlayInfoResponse setBody(GetVideoPlayInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoPlayInfoResponseBody getBody() {
        return this.body;
    }

}
