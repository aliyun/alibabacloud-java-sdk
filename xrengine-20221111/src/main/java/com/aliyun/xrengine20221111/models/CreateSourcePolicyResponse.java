// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class CreateSourcePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSourcePolicyResponseBody body;

    public static CreateSourcePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSourcePolicyResponse self = new CreateSourcePolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateSourcePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSourcePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSourcePolicyResponse setBody(CreateSourcePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSourcePolicyResponseBody getBody() {
        return this.body;
    }

}
