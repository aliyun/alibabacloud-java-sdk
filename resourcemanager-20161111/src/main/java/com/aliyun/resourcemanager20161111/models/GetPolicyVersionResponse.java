// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20161111.models;

import com.aliyun.tea.*;

public class GetPolicyVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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
