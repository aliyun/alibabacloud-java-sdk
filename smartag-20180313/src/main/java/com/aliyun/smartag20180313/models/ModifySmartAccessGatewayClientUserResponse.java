// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySmartAccessGatewayClientUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySmartAccessGatewayClientUserResponseBody body;

    public static ModifySmartAccessGatewayClientUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySmartAccessGatewayClientUserResponse self = new ModifySmartAccessGatewayClientUserResponse();
        return TeaModel.build(map, self);
    }

    public ModifySmartAccessGatewayClientUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySmartAccessGatewayClientUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySmartAccessGatewayClientUserResponse setBody(ModifySmartAccessGatewayClientUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySmartAccessGatewayClientUserResponseBody getBody() {
        return this.body;
    }

}
