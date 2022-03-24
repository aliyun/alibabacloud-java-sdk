// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class CreateReleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Release body;

    public static CreateReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateReleaseResponse self = new CreateReleaseResponse();
        return TeaModel.build(map, self);
    }

    public CreateReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateReleaseResponse setBody(Release body) {
        this.body = body;
        return this;
    }
    public Release getBody() {
        return this.body;
    }

}
