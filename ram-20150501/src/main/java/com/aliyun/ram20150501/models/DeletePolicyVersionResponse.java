// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class DeletePolicyVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePolicyVersionResponseBody body;

    public static DeletePolicyVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyVersionResponse self = new DeletePolicyVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolicyVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolicyVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePolicyVersionResponse setBody(DeletePolicyVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolicyVersionResponseBody getBody() {
        return this.body;
    }

}
