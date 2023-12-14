// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ModifyGatewayFileShareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyGatewayFileShareResponseBody body;

    public static ModifyGatewayFileShareResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGatewayFileShareResponse self = new ModifyGatewayFileShareResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGatewayFileShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGatewayFileShareResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGatewayFileShareResponse setBody(ModifyGatewayFileShareResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGatewayFileShareResponseBody getBody() {
        return this.body;
    }

}
