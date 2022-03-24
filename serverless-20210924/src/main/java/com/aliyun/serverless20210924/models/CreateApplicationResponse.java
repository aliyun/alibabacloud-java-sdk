// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class CreateApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Application body;

    public static CreateApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationResponse self = new CreateApplicationResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationResponse setBody(Application body) {
        this.body = body;
        return this;
    }
    public Application getBody() {
        return this.body;
    }

}
