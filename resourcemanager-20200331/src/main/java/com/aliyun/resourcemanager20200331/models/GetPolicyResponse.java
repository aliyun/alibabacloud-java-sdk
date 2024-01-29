// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPolicyResponseBody body;

    public static GetPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyResponse self = new GetPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPolicyResponse setBody(GetPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPolicyResponseBody getBody() {
        return this.body;
    }

}
