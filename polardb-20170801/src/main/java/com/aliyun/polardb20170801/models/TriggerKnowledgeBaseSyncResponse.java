// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class TriggerKnowledgeBaseSyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TriggerKnowledgeBaseSyncResponseBody body;

    public static TriggerKnowledgeBaseSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerKnowledgeBaseSyncResponse self = new TriggerKnowledgeBaseSyncResponse();
        return TeaModel.build(map, self);
    }

    public TriggerKnowledgeBaseSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerKnowledgeBaseSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerKnowledgeBaseSyncResponse setBody(TriggerKnowledgeBaseSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerKnowledgeBaseSyncResponseBody getBody() {
        return this.body;
    }

}
