// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class TestProcessExpressionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TestProcessExpressionResponseBody body;

    public static TestProcessExpressionResponse build(java.util.Map<String, ?> map) throws Exception {
        TestProcessExpressionResponse self = new TestProcessExpressionResponse();
        return TeaModel.build(map, self);
    }

    public TestProcessExpressionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TestProcessExpressionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TestProcessExpressionResponse setBody(TestProcessExpressionResponseBody body) {
        this.body = body;
        return this;
    }
    public TestProcessExpressionResponseBody getBody() {
        return this.body;
    }

}
