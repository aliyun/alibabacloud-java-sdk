// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHostResponseBody body;

    public static CreateHostResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHostResponse self = new CreateHostResponse();
        return TeaModel.build(map, self);
    }

    public CreateHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHostResponse setBody(CreateHostResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHostResponseBody getBody() {
        return this.body;
    }

}
