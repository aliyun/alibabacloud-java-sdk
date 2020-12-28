// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetPolicyVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPolicyVersionResponseBody body;

    public static GetPolicyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyVersionResponse self = new GetPolicyVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetPolicyVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPolicyVersionResponse setBody(GetPolicyVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPolicyVersionResponseBody getBody() {
        return this.body;
    }

}
