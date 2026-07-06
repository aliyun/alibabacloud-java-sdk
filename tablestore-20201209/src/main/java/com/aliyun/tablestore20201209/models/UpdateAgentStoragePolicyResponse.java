// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class UpdateAgentStoragePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAgentStoragePolicyResponseBody body;

    public static UpdateAgentStoragePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentStoragePolicyResponse self = new UpdateAgentStoragePolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgentStoragePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgentStoragePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAgentStoragePolicyResponse setBody(UpdateAgentStoragePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgentStoragePolicyResponseBody getBody() {
        return this.body;
    }

}
