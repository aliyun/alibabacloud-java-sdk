// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class CreateProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProfileResponseBody body;

    public static CreateProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProfileResponse self = new CreateProfileResponse();
        return TeaModel.build(map, self);
    }

    public CreateProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProfileResponse setBody(CreateProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProfileResponseBody getBody() {
        return this.body;
    }

}
