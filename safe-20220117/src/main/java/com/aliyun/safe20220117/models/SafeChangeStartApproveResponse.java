// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class SafeChangeStartApproveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SafeChangeStartApproveResponseBody body;

    public static SafeChangeStartApproveResponse build(java.util.Map<String, ?> map) throws Exception {
        SafeChangeStartApproveResponse self = new SafeChangeStartApproveResponse();
        return TeaModel.build(map, self);
    }

    public SafeChangeStartApproveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SafeChangeStartApproveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SafeChangeStartApproveResponse setBody(SafeChangeStartApproveResponseBody body) {
        this.body = body;
        return this;
    }
    public SafeChangeStartApproveResponseBody getBody() {
        return this.body;
    }

}
