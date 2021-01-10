// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateODPSchemasLogicTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateODPSchemasLogicTablesResponseBody body;

    public static UpdateODPSchemasLogicTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateODPSchemasLogicTablesResponse self = new UpdateODPSchemasLogicTablesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateODPSchemasLogicTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateODPSchemasLogicTablesResponse setBody(UpdateODPSchemasLogicTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateODPSchemasLogicTablesResponseBody getBody() {
        return this.body;
    }

}
