// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class RetryChangeAccountEmailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryChangeAccountEmailResponseBody body;

    public static RetryChangeAccountEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryChangeAccountEmailResponse self = new RetryChangeAccountEmailResponse();
        return TeaModel.build(map, self);
    }

    public RetryChangeAccountEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryChangeAccountEmailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryChangeAccountEmailResponse setBody(RetryChangeAccountEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryChangeAccountEmailResponseBody getBody() {
        return this.body;
    }

}
