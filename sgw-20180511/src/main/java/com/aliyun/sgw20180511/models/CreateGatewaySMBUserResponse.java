// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateGatewaySMBUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public CreateGatewaySMBUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGatewaySMBUserResponse setBody(CreateGatewaySMBUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGatewaySMBUserResponseBody getBody() {
        return this.body;
    }

}
