// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantReadOnlyConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTenantReadOnlyConnectionResponseBody body;

    public static CreateTenantReadOnlyConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantReadOnlyConnectionResponse self = new CreateTenantReadOnlyConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateTenantReadOnlyConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTenantReadOnlyConnectionResponse setBody(CreateTenantReadOnlyConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTenantReadOnlyConnectionResponseBody getBody() {
        return this.body;
    }

}
