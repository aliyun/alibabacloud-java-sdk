// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateCheckPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCheckPolicyResponseBody body;

    public static CreateCheckPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCheckPolicyResponse self = new CreateCheckPolicyResponse();
        return TeaModel.build(map, self);
    }

    public CreateCheckPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCheckPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCheckPolicyResponse setBody(CreateCheckPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCheckPolicyResponseBody getBody() {
        return this.body;
    }

}
