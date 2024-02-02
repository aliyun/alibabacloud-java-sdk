// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class CreateAvatarTalkProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAvatarTalkProjectResponseBody body;

    public static CreateAvatarTalkProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAvatarTalkProjectResponse self = new CreateAvatarTalkProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateAvatarTalkProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAvatarTalkProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAvatarTalkProjectResponse setBody(CreateAvatarTalkProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAvatarTalkProjectResponseBody getBody() {
        return this.body;
    }

}
