// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopQueryAvatarProjectDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PopQueryAvatarProjectDetailResponseBody body;

    public static PopQueryAvatarProjectDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        PopQueryAvatarProjectDetailResponse self = new PopQueryAvatarProjectDetailResponse();
        return TeaModel.build(map, self);
    }

    public PopQueryAvatarProjectDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopQueryAvatarProjectDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopQueryAvatarProjectDetailResponse setBody(PopQueryAvatarProjectDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public PopQueryAvatarProjectDetailResponseBody getBody() {
        return this.body;
    }

}
