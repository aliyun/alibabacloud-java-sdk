// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateMonitorTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMonitorTaskResponseBody body;

    public static CreateMonitorTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorTaskResponse self = new CreateMonitorTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateMonitorTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMonitorTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMonitorTaskResponse setBody(CreateMonitorTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMonitorTaskResponseBody getBody() {
        return this.body;
    }

}
