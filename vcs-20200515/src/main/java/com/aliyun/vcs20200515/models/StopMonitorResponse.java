// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class StopMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopMonitorResponseBody body;

    public static StopMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        StopMonitorResponse self = new StopMonitorResponse();
        return TeaModel.build(map, self);
    }

    public StopMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopMonitorResponse setBody(StopMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public StopMonitorResponseBody getBody() {
        return this.body;
    }

}
