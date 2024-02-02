// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class CreateLivePortraitProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLivePortraitProjectResponseBody body;

    public static CreateLivePortraitProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLivePortraitProjectResponse self = new CreateLivePortraitProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateLivePortraitProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLivePortraitProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLivePortraitProjectResponse setBody(CreateLivePortraitProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLivePortraitProjectResponseBody getBody() {
        return this.body;
    }

}
