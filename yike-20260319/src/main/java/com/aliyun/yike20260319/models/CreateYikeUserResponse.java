// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class CreateYikeUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateYikeUserResponseBody body;

    public static CreateYikeUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateYikeUserResponse self = new CreateYikeUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateYikeUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateYikeUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateYikeUserResponse setBody(CreateYikeUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateYikeUserResponseBody getBody() {
        return this.body;
    }

}
