// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteSmartAccessGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSmartAccessGatewayResponseBody body;

    public static DeleteSmartAccessGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmartAccessGatewayResponse self = new DeleteSmartAccessGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSmartAccessGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSmartAccessGatewayResponse setBody(DeleteSmartAccessGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSmartAccessGatewayResponseBody getBody() {
        return this.body;
    }

}
