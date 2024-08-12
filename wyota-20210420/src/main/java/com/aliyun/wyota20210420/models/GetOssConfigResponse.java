// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetOssConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOssConfigResponseBody body;

    public static GetOssConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssConfigResponse self = new GetOssConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetOssConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssConfigResponse setBody(GetOssConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssConfigResponseBody getBody() {
        return this.body;
    }

}
