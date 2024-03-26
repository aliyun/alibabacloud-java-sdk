// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetVideoInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoInfoResponse setBody(GetVideoInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoInfoResponseBody getBody() {
        return this.body;
    }

}
