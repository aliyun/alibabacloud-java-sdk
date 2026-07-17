// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class CreateYikeEditingProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateYikeEditingProjectResponseBody body;

    public static CreateYikeEditingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateYikeEditingProjectResponse self = new CreateYikeEditingProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateYikeEditingProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateYikeEditingProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateYikeEditingProjectResponse setBody(CreateYikeEditingProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateYikeEditingProjectResponseBody getBody() {
        return this.body;
    }

}
