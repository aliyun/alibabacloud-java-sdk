// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class SetTLSCipherPolicyAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SetTLSCipherPolicyAttributeResponse setBody(SetTLSCipherPolicyAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public SetTLSCipherPolicyAttributeResponseBody getBody() {
        return this.body;
    }

}
