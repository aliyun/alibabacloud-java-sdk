// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class CheckAgentStoragePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckAgentStoragePolicyResponseBody body;

    public static CheckAgentStoragePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAgentStoragePolicyResponse self = new CheckAgentStoragePolicyResponse();
        return TeaModel.build(map, self);
    }

    public CheckAgentStoragePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAgentStoragePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAgentStoragePolicyResponse setBody(CheckAgentStoragePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAgentStoragePolicyResponseBody getBody() {
        return this.body;
    }

}
