// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RunNotifyComponentWithEmailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunNotifyComponentWithEmailResponseBody body;

    public static RunNotifyComponentWithEmailResponse build(java.util.Map<String, ?> map) throws Exception {
        RunNotifyComponentWithEmailResponse self = new RunNotifyComponentWithEmailResponse();
        return TeaModel.build(map, self);
    }

    public RunNotifyComponentWithEmailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunNotifyComponentWithEmailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunNotifyComponentWithEmailResponse setBody(RunNotifyComponentWithEmailResponseBody body) {
        this.body = body;
        return this;
    }
    public RunNotifyComponentWithEmailResponseBody getBody() {
        return this.body;
    }

}
