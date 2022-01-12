// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class StartAgentMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartAgentMonitorResponseBody body;

    public static StartAgentMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAgentMonitorResponse self = new StartAgentMonitorResponse();
        return TeaModel.build(map, self);
    }

    public StartAgentMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAgentMonitorResponse setBody(StartAgentMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAgentMonitorResponseBody getBody() {
        return this.body;
    }

}
