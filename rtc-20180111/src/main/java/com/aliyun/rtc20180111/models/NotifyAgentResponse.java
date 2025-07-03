// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class NotifyAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public NotifyAgentResponseBody body;

    public static NotifyAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        NotifyAgentResponse self = new NotifyAgentResponse();
        return TeaModel.build(map, self);
    }

    public NotifyAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NotifyAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NotifyAgentResponse setBody(NotifyAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public NotifyAgentResponseBody getBody() {
        return this.body;
    }

}
