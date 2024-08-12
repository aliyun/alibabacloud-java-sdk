// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetFbOssConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFbOssConfigResponseBody body;

    public static GetFbOssConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFbOssConfigResponse self = new GetFbOssConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetFbOssConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFbOssConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFbOssConfigResponse setBody(GetFbOssConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFbOssConfigResponseBody getBody() {
        return this.body;
    }

}
