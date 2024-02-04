// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class AssociateChatbotInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateChatbotInstanceResponseBody body;

    public static AssociateChatbotInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateChatbotInstanceResponse self = new AssociateChatbotInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AssociateChatbotInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateChatbotInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateChatbotInstanceResponse setBody(AssociateChatbotInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateChatbotInstanceResponseBody getBody() {
        return this.body;
    }

}
