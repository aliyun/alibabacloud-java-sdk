// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateServiceLinkedRoleResponseBody body;

    public static CreateServiceLinkedRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleResponse self = new CreateServiceLinkedRoleResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceLinkedRoleResponse setBody(CreateServiceLinkedRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceLinkedRoleResponseBody getBody() {
        return this.body;
    }

}
