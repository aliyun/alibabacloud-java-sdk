// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class RunNotifyComponentWithMessageCenterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunNotifyComponentWithMessageCenterResponseBody body;

    public static RunNotifyComponentWithMessageCenterResponse build(java.util.Map<String, ?> map) throws Exception {
        RunNotifyComponentWithMessageCenterResponse self = new RunNotifyComponentWithMessageCenterResponse();
        return TeaModel.build(map, self);
    }

    public RunNotifyComponentWithMessageCenterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunNotifyComponentWithMessageCenterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunNotifyComponentWithMessageCenterResponse setBody(RunNotifyComponentWithMessageCenterResponseBody body) {
        this.body = body;
        return this;
    }
    public RunNotifyComponentWithMessageCenterResponseBody getBody() {
        return this.body;
    }

}
