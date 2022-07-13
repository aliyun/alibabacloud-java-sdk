// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class AnwserAgentMonitorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AnwserAgentMonitorResponseBody body;

    public static AnwserAgentMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        AnwserAgentMonitorResponse self = new AnwserAgentMonitorResponse();
        return TeaModel.build(map, self);
    }

    public AnwserAgentMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AnwserAgentMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AnwserAgentMonitorResponse setBody(AnwserAgentMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public AnwserAgentMonitorResponseBody getBody() {
        return this.body;
    }

}
