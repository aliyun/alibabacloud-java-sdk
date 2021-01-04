// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class GenerateExecutionPolicyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateExecutionPolicyResponseBody body;

    public static GenerateExecutionPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateExecutionPolicyResponse self = new GenerateExecutionPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GenerateExecutionPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateExecutionPolicyResponse setBody(GenerateExecutionPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateExecutionPolicyResponseBody getBody() {
        return this.body;
    }

}
