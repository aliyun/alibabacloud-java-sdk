// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartAgentResponseBody body;

    public static StartAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAgentResponse self = new StartAgentResponse();
        return TeaModel.build(map, self);
    }

    public StartAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartAgentResponse setBody(StartAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public StartAgentResponseBody getBody() {
        return this.body;
    }

}
