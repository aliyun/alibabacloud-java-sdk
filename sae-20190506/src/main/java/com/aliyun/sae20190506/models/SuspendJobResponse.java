// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class SuspendJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SuspendJobResponseBody body;

    public static SuspendJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendJobResponse self = new SuspendJobResponse();
        return TeaModel.build(map, self);
    }

    public SuspendJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuspendJobResponse setBody(SuspendJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendJobResponseBody getBody() {
        return this.body;
    }

}
