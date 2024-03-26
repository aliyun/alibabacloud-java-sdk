// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetVideoInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoInfosResponse setBody(GetVideoInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoInfosResponseBody getBody() {
        return this.body;
    }

}
