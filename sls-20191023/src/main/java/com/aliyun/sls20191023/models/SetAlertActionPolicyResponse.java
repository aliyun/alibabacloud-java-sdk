// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class SetAlertActionPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetAlertActionPolicyResponseBody body;

    public static SetAlertActionPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAlertActionPolicyResponse self = new SetAlertActionPolicyResponse();
        return TeaModel.build(map, self);
    }

    public SetAlertActionPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAlertActionPolicyResponse setBody(SetAlertActionPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAlertActionPolicyResponseBody getBody() {
        return this.body;
    }

}
