// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RetryStartDeployResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryStartDeployResponseBody body;

    public static RetryStartDeployResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryStartDeployResponse self = new RetryStartDeployResponse();
        return TeaModel.build(map, self);
    }

    public RetryStartDeployResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryStartDeployResponse setBody(RetryStartDeployResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryStartDeployResponseBody getBody() {
        return this.body;
    }

}
