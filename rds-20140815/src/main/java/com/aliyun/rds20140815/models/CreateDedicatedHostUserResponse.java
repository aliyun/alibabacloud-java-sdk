// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDedicatedHostUserResponseBody body;

    public static CreateDedicatedHostUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostUserResponse self = new CreateDedicatedHostUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedHostUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDedicatedHostUserResponse setBody(CreateDedicatedHostUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDedicatedHostUserResponseBody getBody() {
        return this.body;
    }

}
