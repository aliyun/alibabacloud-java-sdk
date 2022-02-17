// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateASMGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public UpdateASMGatewayResponse setBody(UpdateASMGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateASMGatewayResponseBody getBody() {
        return this.body;
    }

}
