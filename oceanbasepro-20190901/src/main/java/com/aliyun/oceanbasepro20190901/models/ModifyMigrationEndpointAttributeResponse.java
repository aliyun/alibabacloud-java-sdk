// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyMigrationEndpointAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMigrationEndpointAttributeResponseBody body;

    public static ModifyMigrationEndpointAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMigrationEndpointAttributeResponse self = new ModifyMigrationEndpointAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMigrationEndpointAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMigrationEndpointAttributeResponse setBody(ModifyMigrationEndpointAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMigrationEndpointAttributeResponseBody getBody() {
        return this.body;
    }

}
