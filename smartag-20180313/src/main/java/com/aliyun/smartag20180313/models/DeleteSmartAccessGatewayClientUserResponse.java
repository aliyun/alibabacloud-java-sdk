// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteSmartAccessGatewayClientUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSmartAccessGatewayClientUserResponseBody body;

    public static DeleteSmartAccessGatewayClientUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmartAccessGatewayClientUserResponse self = new DeleteSmartAccessGatewayClientUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSmartAccessGatewayClientUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSmartAccessGatewayClientUserResponse setBody(DeleteSmartAccessGatewayClientUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSmartAccessGatewayClientUserResponseBody getBody() {
        return this.body;
    }

}
