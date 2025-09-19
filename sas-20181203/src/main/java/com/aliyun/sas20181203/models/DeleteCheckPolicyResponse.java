// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCheckPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCheckPolicyResponseBody body;

    public static DeleteCheckPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCheckPolicyResponse self = new DeleteCheckPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCheckPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCheckPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCheckPolicyResponse setBody(DeleteCheckPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCheckPolicyResponseBody getBody() {
        return this.body;
    }

}
