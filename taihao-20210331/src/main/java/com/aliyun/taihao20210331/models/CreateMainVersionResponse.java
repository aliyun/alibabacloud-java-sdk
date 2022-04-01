// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateMainVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMainVersionResponseBody body;

    public static CreateMainVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMainVersionResponse self = new CreateMainVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateMainVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMainVersionResponse setBody(CreateMainVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMainVersionResponseBody getBody() {
        return this.body;
    }

}
