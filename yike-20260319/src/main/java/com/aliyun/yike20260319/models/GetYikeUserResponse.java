// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetYikeUserResponseBody body;

    public static GetYikeUserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetYikeUserResponse self = new GetYikeUserResponse();
        return TeaModel.build(map, self);
    }

    public GetYikeUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetYikeUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetYikeUserResponse setBody(GetYikeUserResponseBody body) {
        this.body = body;
        return this;
    }
    public GetYikeUserResponseBody getBody() {
        return this.body;
    }

}
