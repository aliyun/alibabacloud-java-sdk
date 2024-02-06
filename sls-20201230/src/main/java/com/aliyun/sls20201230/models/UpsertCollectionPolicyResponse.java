// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpsertCollectionPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpsertCollectionPolicyResponseBody body;

    public static UpsertCollectionPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpsertCollectionPolicyResponse self = new UpsertCollectionPolicyResponse();
        return TeaModel.build(map, self);
    }

    public UpsertCollectionPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpsertCollectionPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpsertCollectionPolicyResponse setBody(UpsertCollectionPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpsertCollectionPolicyResponseBody getBody() {
        return this.body;
    }

}
