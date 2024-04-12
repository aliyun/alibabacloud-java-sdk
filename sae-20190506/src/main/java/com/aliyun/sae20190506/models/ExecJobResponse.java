// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ExecJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecJobResponseBody body;

    public static ExecJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecJobResponse self = new ExecJobResponse();
        return TeaModel.build(map, self);
    }

    public ExecJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecJobResponse setBody(ExecJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecJobResponseBody getBody() {
        return this.body;
    }

}
