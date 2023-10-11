// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListTextToAvatarProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PopListTextToAvatarProjectResponseBody body;

    public static PopListTextToAvatarProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PopListTextToAvatarProjectResponse self = new PopListTextToAvatarProjectResponse();
        return TeaModel.build(map, self);
    }

    public PopListTextToAvatarProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopListTextToAvatarProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopListTextToAvatarProjectResponse setBody(PopListTextToAvatarProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PopListTextToAvatarProjectResponseBody getBody() {
        return this.body;
    }

}
