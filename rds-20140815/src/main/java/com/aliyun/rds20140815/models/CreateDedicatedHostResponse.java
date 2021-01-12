// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDedicatedHostResponseBody body;

    public static CreateDedicatedHostResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostResponse self = new CreateDedicatedHostResponse();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDedicatedHostResponse setBody(CreateDedicatedHostResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDedicatedHostResponseBody getBody() {
        return this.body;
    }

}
