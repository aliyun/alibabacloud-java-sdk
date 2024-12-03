// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class DeleteInstancePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteInstancePolicyResponseBody body;

    public static DeleteInstancePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstancePolicyResponse self = new DeleteInstancePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstancePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstancePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInstancePolicyResponse setBody(DeleteInstancePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstancePolicyResponseBody getBody() {
        return this.body;
    }

}
