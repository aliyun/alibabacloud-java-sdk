// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateUserClusterHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUserClusterHostResponseBody body;

    public static CreateUserClusterHostResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserClusterHostResponse self = new CreateUserClusterHostResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserClusterHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserClusterHostResponse setBody(CreateUserClusterHostResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserClusterHostResponseBody getBody() {
        return this.body;
    }

}
