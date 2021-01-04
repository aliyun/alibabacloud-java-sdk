// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateSmartAccessGatewayClientUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSmartAccessGatewayClientUserResponseBody body;

    public static CreateSmartAccessGatewayClientUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSmartAccessGatewayClientUserResponse self = new CreateSmartAccessGatewayClientUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateSmartAccessGatewayClientUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSmartAccessGatewayClientUserResponse setBody(CreateSmartAccessGatewayClientUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSmartAccessGatewayClientUserResponseBody getBody() {
        return this.body;
    }

}
