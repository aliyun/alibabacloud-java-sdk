// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20190430.models;

import com.aliyun.tea.*;

public class CreateProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateProjectResponseBody body;

    public static CreateProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectResponse self = new CreateProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProjectResponse setBody(CreateProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProjectResponseBody getBody() {
        return this.body;
    }

}
