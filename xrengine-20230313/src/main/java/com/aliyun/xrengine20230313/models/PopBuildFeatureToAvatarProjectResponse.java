// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopBuildFeatureToAvatarProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PopBuildFeatureToAvatarProjectResponseBody body;

    public static PopBuildFeatureToAvatarProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PopBuildFeatureToAvatarProjectResponse self = new PopBuildFeatureToAvatarProjectResponse();
        return TeaModel.build(map, self);
    }

    public PopBuildFeatureToAvatarProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopBuildFeatureToAvatarProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopBuildFeatureToAvatarProjectResponse setBody(PopBuildFeatureToAvatarProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PopBuildFeatureToAvatarProjectResponseBody getBody() {
        return this.body;
    }

}
