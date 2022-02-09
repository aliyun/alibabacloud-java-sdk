// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteTenantsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTenantsResponseBody body;

    public static DeleteTenantsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTenantsResponse self = new DeleteTenantsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTenantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTenantsResponse setBody(DeleteTenantsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTenantsResponseBody getBody() {
        return this.body;
    }

}
