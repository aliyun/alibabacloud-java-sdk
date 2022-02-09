// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateMigrationEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMigrationEndpointResponseBody body;

    public static CreateMigrationEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMigrationEndpointResponse self = new CreateMigrationEndpointResponse();
        return TeaModel.build(map, self);
    }

    public CreateMigrationEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMigrationEndpointResponse setBody(CreateMigrationEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMigrationEndpointResponseBody getBody() {
        return this.body;
    }

}
