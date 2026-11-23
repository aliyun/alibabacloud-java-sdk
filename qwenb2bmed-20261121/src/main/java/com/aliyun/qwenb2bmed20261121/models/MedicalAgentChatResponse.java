// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bmed20261121.models;

import com.aliyun.tea.*;

public class MedicalAgentChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MedicalAgentChatResponseBody body;

    public static MedicalAgentChatResponse build(java.util.Map<String, ?> map) throws Exception {
        MedicalAgentChatResponse self = new MedicalAgentChatResponse();
        return TeaModel.build(map, self);
    }

    public MedicalAgentChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MedicalAgentChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MedicalAgentChatResponse setBody(MedicalAgentChatResponseBody body) {
        this.body = body;
        return this;
    }
    public MedicalAgentChatResponseBody getBody() {
        return this.body;
    }

}
