// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteODPSchemasLogicTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteODPSchemasLogicTablesResponseBody body;

    public static DeleteODPSchemasLogicTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteODPSchemasLogicTablesResponse self = new DeleteODPSchemasLogicTablesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteODPSchemasLogicTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteODPSchemasLogicTablesResponse setBody(DeleteODPSchemasLogicTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteODPSchemasLogicTablesResponseBody getBody() {
        return this.body;
    }

}
