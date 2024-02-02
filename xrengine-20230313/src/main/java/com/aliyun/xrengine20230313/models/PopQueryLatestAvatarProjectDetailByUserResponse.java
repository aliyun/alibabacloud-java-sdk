// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopQueryLatestAvatarProjectDetailByUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopQueryLatestAvatarProjectDetailByUserResponseBody body;

    public static PopQueryLatestAvatarProjectDetailByUserResponse build(java.util.Map<String, ?> map) throws Exception {
        PopQueryLatestAvatarProjectDetailByUserResponse self = new PopQueryLatestAvatarProjectDetailByUserResponse();
        return TeaModel.build(map, self);
    }

    public PopQueryLatestAvatarProjectDetailByUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopQueryLatestAvatarProjectDetailByUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopQueryLatestAvatarProjectDetailByUserResponse setBody(PopQueryLatestAvatarProjectDetailByUserResponseBody body) {
        this.body = body;
        return this;
    }
    public PopQueryLatestAvatarProjectDetailByUserResponseBody getBody() {
        return this.body;
    }

}
