// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopCreateTextToAvatarProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopCreateTextToAvatarProjectResponseBody body;

    public static PopCreateTextToAvatarProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PopCreateTextToAvatarProjectResponse self = new PopCreateTextToAvatarProjectResponse();
        return TeaModel.build(map, self);
    }

    public PopCreateTextToAvatarProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopCreateTextToAvatarProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopCreateTextToAvatarProjectResponse setBody(PopCreateTextToAvatarProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PopCreateTextToAvatarProjectResponseBody getBody() {
        return this.body;
    }

}
