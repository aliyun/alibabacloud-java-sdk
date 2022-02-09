// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantRestoreTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTenantRestoreTaskResponseBody body;

    public static CreateTenantRestoreTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantRestoreTaskResponse self = new CreateTenantRestoreTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateTenantRestoreTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTenantRestoreTaskResponse setBody(CreateTenantRestoreTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTenantRestoreTaskResponseBody getBody() {
        return this.body;
    }

}
