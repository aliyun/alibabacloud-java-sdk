// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetImageInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageInfosResponseBody body;

    public static GetImageInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageInfosResponse self = new GetImageInfosResponse();
        return TeaModel.build(map, self);
    }

    public GetImageInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageInfosResponse setBody(GetImageInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageInfosResponseBody getBody() {
        return this.body;
    }

}
