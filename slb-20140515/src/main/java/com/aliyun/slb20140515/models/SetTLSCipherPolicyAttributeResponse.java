// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetTLSCipherPolicyAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetTLSCipherPolicyAttributeResponseBody body;

    public static SetTLSCipherPolicyAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        SetTLSCipherPolicyAttributeResponse self = new SetTLSCipherPolicyAttributeResponse();
        return TeaModel.build(map, self);
    }

    public SetTLSCipherPolicyAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetTLSCipherPolicyAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetTLSCipherPolicyAttributeResponse setBody(SetTLSCipherPolicyAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetTLSCipherPolicyAttributeResponseBody getBody() {
        return this.body;
    }

}
