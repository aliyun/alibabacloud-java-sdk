// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RevertAssignedSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevertAssignedSessionResponseBody body;

    public static RevertAssignedSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        RevertAssignedSessionResponse self = new RevertAssignedSessionResponse();
        return TeaModel.build(map, self);
    }

    public RevertAssignedSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevertAssignedSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevertAssignedSessionResponse setBody(RevertAssignedSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public RevertAssignedSessionResponseBody getBody() {
        return this.body;
    }

}
