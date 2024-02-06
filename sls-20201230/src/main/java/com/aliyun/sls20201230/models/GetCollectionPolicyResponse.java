// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCollectionPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCollectionPolicyResponseBody body;

    public static GetCollectionPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCollectionPolicyResponse self = new GetCollectionPolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetCollectionPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCollectionPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCollectionPolicyResponse setBody(GetCollectionPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCollectionPolicyResponseBody getBody() {
        return this.body;
    }

}
