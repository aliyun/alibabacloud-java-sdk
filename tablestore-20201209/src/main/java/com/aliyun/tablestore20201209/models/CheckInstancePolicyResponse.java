// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class CheckInstancePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckInstancePolicyResponseBody body;

    public static CheckInstancePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckInstancePolicyResponse self = new CheckInstancePolicyResponse();
        return TeaModel.build(map, self);
    }

    public CheckInstancePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckInstancePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckInstancePolicyResponse setBody(CheckInstancePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckInstancePolicyResponseBody getBody() {
        return this.body;
    }

}
