// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class DeleteCollectionPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCollectionPolicyResponseBody body;

    public static DeleteCollectionPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCollectionPolicyResponse self = new DeleteCollectionPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCollectionPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCollectionPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCollectionPolicyResponse setBody(DeleteCollectionPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCollectionPolicyResponseBody getBody() {
        return this.body;
    }

}
