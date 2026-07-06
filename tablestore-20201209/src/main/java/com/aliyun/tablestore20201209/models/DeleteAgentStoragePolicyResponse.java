// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class DeleteAgentStoragePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAgentStoragePolicyResponseBody body;

    public static DeleteAgentStoragePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentStoragePolicyResponse self = new DeleteAgentStoragePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAgentStoragePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAgentStoragePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAgentStoragePolicyResponse setBody(DeleteAgentStoragePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAgentStoragePolicyResponseBody getBody() {
        return this.body;
    }

}
