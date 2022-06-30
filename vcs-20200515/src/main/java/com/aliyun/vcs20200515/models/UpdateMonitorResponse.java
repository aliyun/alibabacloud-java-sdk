// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMonitorResponseBody body;

    public static UpdateMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMonitorResponse self = new UpdateMonitorResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMonitorResponse setBody(UpdateMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMonitorResponseBody getBody() {
        return this.body;
    }

}
