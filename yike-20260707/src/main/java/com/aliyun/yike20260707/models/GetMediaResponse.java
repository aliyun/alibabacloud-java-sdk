// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class GetMediaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMediaResponseBody body;

    public static GetMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaResponse self = new GetMediaResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMediaResponse setBody(GetMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaResponseBody getBody() {
        return this.body;
    }

}
