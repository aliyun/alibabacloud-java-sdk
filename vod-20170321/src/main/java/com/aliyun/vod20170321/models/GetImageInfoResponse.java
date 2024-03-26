// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetImageInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetImageInfoResponseBody body;

    public static GetImageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageInfoResponse self = new GetImageInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetImageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetImageInfoResponse setBody(GetImageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageInfoResponseBody getBody() {
        return this.body;
    }

}
