// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GenerateTemplatePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateTemplatePolicyResponseBody body;

    public static GenerateTemplatePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateTemplatePolicyResponse self = new GenerateTemplatePolicyResponse();
        return TeaModel.build(map, self);
    }

    public GenerateTemplatePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateTemplatePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateTemplatePolicyResponse setBody(GenerateTemplatePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateTemplatePolicyResponseBody getBody() {
        return this.body;
    }

}
