// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class UpdateInstancePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstancePolicyResponseBody body;

    public static UpdateInstancePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstancePolicyResponse self = new UpdateInstancePolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstancePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstancePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstancePolicyResponse setBody(UpdateInstancePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstancePolicyResponseBody getBody() {
        return this.body;
    }

}
