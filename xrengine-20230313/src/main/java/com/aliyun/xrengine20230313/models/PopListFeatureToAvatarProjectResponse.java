// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopListFeatureToAvatarProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PopListFeatureToAvatarProjectResponseBody body;

    public static PopListFeatureToAvatarProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PopListFeatureToAvatarProjectResponse self = new PopListFeatureToAvatarProjectResponse();
        return TeaModel.build(map, self);
    }

    public PopListFeatureToAvatarProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopListFeatureToAvatarProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopListFeatureToAvatarProjectResponse setBody(PopListFeatureToAvatarProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PopListFeatureToAvatarProjectResponseBody getBody() {
        return this.body;
    }

}
