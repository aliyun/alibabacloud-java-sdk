// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleForSelectDBResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateServiceLinkedRoleForSelectDBResponseBody body;

    public static CreateServiceLinkedRoleForSelectDBResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleForSelectDBResponse self = new CreateServiceLinkedRoleForSelectDBResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleForSelectDBResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceLinkedRoleForSelectDBResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceLinkedRoleForSelectDBResponse setBody(CreateServiceLinkedRoleForSelectDBResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceLinkedRoleForSelectDBResponseBody getBody() {
        return this.body;
    }

}
