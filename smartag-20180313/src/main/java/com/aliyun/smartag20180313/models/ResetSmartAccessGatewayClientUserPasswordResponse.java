// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ResetSmartAccessGatewayClientUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResetSmartAccessGatewayClientUserPasswordResponseBody body;

    public static ResetSmartAccessGatewayClientUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetSmartAccessGatewayClientUserPasswordResponse self = new ResetSmartAccessGatewayClientUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetSmartAccessGatewayClientUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetSmartAccessGatewayClientUserPasswordResponse setBody(ResetSmartAccessGatewayClientUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetSmartAccessGatewayClientUserPasswordResponseBody getBody() {
        return this.body;
    }

}
