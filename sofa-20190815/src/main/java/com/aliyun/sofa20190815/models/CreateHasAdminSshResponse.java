// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasAdminSshResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasAdminSshResponseBody body;

    public static CreateHasAdminSshResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasAdminSshResponse self = new CreateHasAdminSshResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasAdminSshResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasAdminSshResponse setBody(CreateHasAdminSshResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasAdminSshResponseBody getBody() {
        return this.body;
    }

}
