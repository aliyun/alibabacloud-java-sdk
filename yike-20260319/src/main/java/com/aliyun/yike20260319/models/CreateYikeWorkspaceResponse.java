// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class CreateYikeWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateYikeWorkspaceResponseBody body;

    public static CreateYikeWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateYikeWorkspaceResponse self = new CreateYikeWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateYikeWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateYikeWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateYikeWorkspaceResponse setBody(CreateYikeWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateYikeWorkspaceResponseBody getBody() {
        return this.body;
    }

}
