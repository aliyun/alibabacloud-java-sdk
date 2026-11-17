// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetScheduledTaskConversationRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetScheduledTaskConversationRecordsResponseBody body;

    public static GetScheduledTaskConversationRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledTaskConversationRecordsResponse self = new GetScheduledTaskConversationRecordsResponse();
        return TeaModel.build(map, self);
    }

    public GetScheduledTaskConversationRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetScheduledTaskConversationRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetScheduledTaskConversationRecordsResponse setBody(GetScheduledTaskConversationRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetScheduledTaskConversationRecordsResponseBody getBody() {
        return this.body;
    }

}
