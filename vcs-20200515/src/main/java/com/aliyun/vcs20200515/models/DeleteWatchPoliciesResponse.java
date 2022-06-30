// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteWatchPoliciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteWatchPoliciesResponseBody body;

    public static DeleteWatchPoliciesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWatchPoliciesResponse self = new DeleteWatchPoliciesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWatchPoliciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWatchPoliciesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWatchPoliciesResponse setBody(DeleteWatchPoliciesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWatchPoliciesResponseBody getBody() {
        return this.body;
    }

}
