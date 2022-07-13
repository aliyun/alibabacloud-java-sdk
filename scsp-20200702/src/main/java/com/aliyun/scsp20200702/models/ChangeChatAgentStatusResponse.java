// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class ChangeChatAgentStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeChatAgentStatusResponseBody body;

    public static ChangeChatAgentStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeChatAgentStatusResponse self = new ChangeChatAgentStatusResponse();
        return TeaModel.build(map, self);
    }

    public ChangeChatAgentStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeChatAgentStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeChatAgentStatusResponse setBody(ChangeChatAgentStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeChatAgentStatusResponseBody getBody() {
        return this.body;
    }

}
