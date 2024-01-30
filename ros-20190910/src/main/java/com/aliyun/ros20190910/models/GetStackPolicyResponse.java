// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetStackPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStackPolicyResponseBody body;

    public static GetStackPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStackPolicyResponse self = new GetStackPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetStackPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStackPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStackPolicyResponse setBody(GetStackPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStackPolicyResponseBody getBody() {
        return this.body;
    }

}
