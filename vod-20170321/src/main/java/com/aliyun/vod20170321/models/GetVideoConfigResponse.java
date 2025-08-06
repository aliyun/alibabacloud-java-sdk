// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetVideoConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVideoConfigResponseBody body;

    public static GetVideoConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoConfigResponse self = new GetVideoConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoConfigResponse setBody(GetVideoConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoConfigResponseBody getBody() {
        return this.body;
    }

}
