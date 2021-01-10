// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateODPSchemasLogicTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateODPSchemasLogicTablesResponseBody body;

    public static CreateODPSchemasLogicTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateODPSchemasLogicTablesResponse self = new CreateODPSchemasLogicTablesResponse();
        return TeaModel.build(map, self);
    }

    public CreateODPSchemasLogicTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateODPSchemasLogicTablesResponse setBody(CreateODPSchemasLogicTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateODPSchemasLogicTablesResponseBody getBody() {
        return this.body;
    }

}
