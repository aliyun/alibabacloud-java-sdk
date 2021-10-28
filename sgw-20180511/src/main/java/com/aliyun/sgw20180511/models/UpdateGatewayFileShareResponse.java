// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class UpdateGatewayFileShareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGatewayFileShareResponseBody body;

    public static UpdateGatewayFileShareResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayFileShareResponse self = new UpdateGatewayFileShareResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayFileShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayFileShareResponse setBody(UpdateGatewayFileShareResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayFileShareResponseBody getBody() {
        return this.body;
    }

}
