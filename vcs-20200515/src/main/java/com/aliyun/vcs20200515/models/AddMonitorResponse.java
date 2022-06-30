// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddMonitorResponseBody body;

    public static AddMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMonitorResponse self = new AddMonitorResponse();
        return TeaModel.build(map, self);
    }

    public AddMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMonitorResponse setBody(AddMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMonitorResponseBody getBody() {
        return this.body;
    }

}
