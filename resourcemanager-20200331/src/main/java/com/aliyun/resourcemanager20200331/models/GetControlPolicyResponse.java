// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetControlPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetControlPolicyResponseBody body;

    public static GetControlPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetControlPolicyResponse self = new GetControlPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetControlPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetControlPolicyResponse setBody(GetControlPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetControlPolicyResponseBody getBody() {
        return this.body;
    }

}
