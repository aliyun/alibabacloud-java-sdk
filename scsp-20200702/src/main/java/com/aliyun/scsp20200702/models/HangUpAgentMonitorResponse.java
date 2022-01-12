// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class HangUpAgentMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HangUpAgentMonitorResponseBody body;

    public static HangUpAgentMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        HangUpAgentMonitorResponse self = new HangUpAgentMonitorResponse();
        return TeaModel.build(map, self);
    }

    public HangUpAgentMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HangUpAgentMonitorResponse setBody(HangUpAgentMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public HangUpAgentMonitorResponseBody getBody() {
        return this.body;
    }

}
