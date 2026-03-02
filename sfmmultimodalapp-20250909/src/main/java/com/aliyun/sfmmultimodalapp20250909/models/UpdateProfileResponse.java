// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProfileResponseBody body;

    public static UpdateProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProfileResponse self = new UpdateProfileResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProfileResponse setBody(UpdateProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProfileResponseBody getBody() {
        return this.body;
    }

}
