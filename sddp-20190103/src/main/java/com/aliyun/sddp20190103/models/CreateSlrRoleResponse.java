// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class CreateSlrRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSlrRoleResponseBody body;

    public static CreateSlrRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSlrRoleResponse self = new CreateSlrRoleResponse();
        return TeaModel.build(map, self);
    }

    public CreateSlrRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSlrRoleResponse setBody(CreateSlrRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSlrRoleResponseBody getBody() {
        return this.body;
    }

}
