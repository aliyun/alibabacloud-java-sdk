// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateGatewayFileShareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGatewayFileShareResponseBody body;

    public static CreateGatewayFileShareResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayFileShareResponse self = new CreateGatewayFileShareResponse();
        return TeaModel.build(map, self);
    }

    public CreateGatewayFileShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGatewayFileShareResponse setBody(CreateGatewayFileShareResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGatewayFileShareResponseBody getBody() {
        return this.body;
    }

}
