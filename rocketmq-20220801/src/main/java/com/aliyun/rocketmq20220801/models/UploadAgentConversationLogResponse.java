// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UploadAgentConversationLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadAgentConversationLogResponseBody body;

    public static UploadAgentConversationLogResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadAgentConversationLogResponse self = new UploadAgentConversationLogResponse();
        return TeaModel.build(map, self);
    }

    public UploadAgentConversationLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadAgentConversationLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadAgentConversationLogResponse setBody(UploadAgentConversationLogResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadAgentConversationLogResponseBody getBody() {
        return this.body;
    }

}
