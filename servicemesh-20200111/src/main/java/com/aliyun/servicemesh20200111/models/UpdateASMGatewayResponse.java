// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateASMGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateASMGatewayResponseBody body;

    public static UpdateASMGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateASMGatewayResponse self = new UpdateASMGatewayResponse();
        return TeaModel.build(map, self);
    }

    public UpdateASMGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateASMGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateASMGatewayResponse setBody(UpdateASMGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateASMGatewayResponseBody getBody() {
        return this.body;
    }

}
