// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class GetEffectivePolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetEffectivePolicyResponseBody body;

    public static GetEffectivePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEffectivePolicyResponse self = new GetEffectivePolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetEffectivePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEffectivePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEffectivePolicyResponse setBody(GetEffectivePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEffectivePolicyResponseBody getBody() {
        return this.body;
    }

}
