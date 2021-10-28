// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateGatewaySMBUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGatewaySMBUserResponseBody body;

    public static CreateGatewaySMBUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewaySMBUserResponse self = new CreateGatewaySMBUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateGatewaySMBUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGatewaySMBUserResponse setBody(CreateGatewaySMBUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGatewaySMBUserResponseBody getBody() {
        return this.body;
    }

}
