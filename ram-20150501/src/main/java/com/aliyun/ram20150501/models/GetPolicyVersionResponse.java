// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetPolicyVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetPolicyVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPolicyVersionResponse setBody(GetPolicyVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPolicyVersionResponseBody getBody() {
        return this.body;
    }

}
