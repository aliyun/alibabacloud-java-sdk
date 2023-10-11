// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopBuildTextToAvatarProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PopBuildTextToAvatarProjectResponseBody body;

    public static PopBuildTextToAvatarProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PopBuildTextToAvatarProjectResponse self = new PopBuildTextToAvatarProjectResponse();
        return TeaModel.build(map, self);
    }

    public PopBuildTextToAvatarProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopBuildTextToAvatarProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopBuildTextToAvatarProjectResponse setBody(PopBuildTextToAvatarProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PopBuildTextToAvatarProjectResponseBody getBody() {
        return this.body;
    }

}
