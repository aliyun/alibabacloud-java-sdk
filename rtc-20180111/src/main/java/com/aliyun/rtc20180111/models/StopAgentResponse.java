// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopAgentResponseBody body;

    public static StopAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        StopAgentResponse self = new StopAgentResponse();
        return TeaModel.build(map, self);
    }

    public StopAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopAgentResponse setBody(StopAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public StopAgentResponseBody getBody() {
        return this.body;
    }

}
