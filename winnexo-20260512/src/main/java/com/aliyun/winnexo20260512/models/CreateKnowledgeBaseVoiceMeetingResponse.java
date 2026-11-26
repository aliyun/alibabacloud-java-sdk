// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateKnowledgeBaseVoiceMeetingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateKnowledgeBaseVoiceMeetingResponseBody body;

    public static CreateKnowledgeBaseVoiceMeetingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeBaseVoiceMeetingResponse self = new CreateKnowledgeBaseVoiceMeetingResponse();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeBaseVoiceMeetingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateKnowledgeBaseVoiceMeetingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateKnowledgeBaseVoiceMeetingResponse setBody(CreateKnowledgeBaseVoiceMeetingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateKnowledgeBaseVoiceMeetingResponseBody getBody() {
        return this.body;
    }

}
