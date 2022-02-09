// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTenantReadOnlyConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTenantReadOnlyConnectionResponseBody body;

    public static DeleteTenantReadOnlyConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantReadOnlyConnectionResponse self = new DeleteTenantReadOnlyConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTenantReadOnlyConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTenantReadOnlyConnectionResponse setBody(DeleteTenantReadOnlyConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTenantReadOnlyConnectionResponseBody getBody() {
        return this.body;
    }

}
