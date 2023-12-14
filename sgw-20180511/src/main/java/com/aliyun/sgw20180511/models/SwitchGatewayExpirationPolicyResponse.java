// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class SwitchGatewayExpirationPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SwitchGatewayExpirationPolicyResponseBody body;

    public static SwitchGatewayExpirationPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchGatewayExpirationPolicyResponse self = new SwitchGatewayExpirationPolicyResponse();
        return TeaModel.build(map, self);
    }

    public SwitchGatewayExpirationPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchGatewayExpirationPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchGatewayExpirationPolicyResponse setBody(SwitchGatewayExpirationPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchGatewayExpirationPolicyResponseBody getBody() {
        return this.body;
    }

}
