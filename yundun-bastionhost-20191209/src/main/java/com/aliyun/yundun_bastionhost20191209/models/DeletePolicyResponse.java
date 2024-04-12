// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeletePolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePolicyResponseBody body;

    public static DeletePolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyResponse self = new DeletePolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePolicyResponse setBody(DeletePolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolicyResponseBody getBody() {
        return this.body;
    }

}
