// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class VerifyPythonFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public VerifyPythonFileResponseBody body;

    public static VerifyPythonFileResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyPythonFileResponse self = new VerifyPythonFileResponse();
        return TeaModel.build(map, self);
    }

    public VerifyPythonFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyPythonFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyPythonFileResponse setBody(VerifyPythonFileResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyPythonFileResponseBody getBody() {
        return this.body;
    }

}
