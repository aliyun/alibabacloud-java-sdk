// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ExecDatamaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecDatamaskResponseBody body;

    public static ExecDatamaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecDatamaskResponse self = new ExecDatamaskResponse();
        return TeaModel.build(map, self);
    }

    public ExecDatamaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecDatamaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecDatamaskResponse setBody(ExecDatamaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecDatamaskResponseBody getBody() {
        return this.body;
    }

}
