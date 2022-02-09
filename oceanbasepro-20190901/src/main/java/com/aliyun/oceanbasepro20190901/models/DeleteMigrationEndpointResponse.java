// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DeleteMigrationEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMigrationEndpointResponseBody body;

    public static DeleteMigrationEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMigrationEndpointResponse self = new DeleteMigrationEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMigrationEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMigrationEndpointResponse setBody(DeleteMigrationEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMigrationEndpointResponseBody getBody() {
        return this.body;
    }

}
