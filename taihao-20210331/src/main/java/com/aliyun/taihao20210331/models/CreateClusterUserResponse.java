// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateClusterUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateClusterUserResponseBody body;

    public static CreateClusterUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterUserResponse self = new CreateClusterUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateClusterUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateClusterUserResponse setBody(CreateClusterUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateClusterUserResponseBody getBody() {
        return this.body;
    }

}
