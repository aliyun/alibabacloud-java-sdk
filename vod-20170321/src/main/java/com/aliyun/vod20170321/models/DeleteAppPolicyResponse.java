// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteAppPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAppPolicyResponseBody body;

    public static DeleteAppPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppPolicyResponse self = new DeleteAppPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAppPolicyResponse setBody(DeleteAppPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppPolicyResponseBody getBody() {
        return this.body;
    }

}
