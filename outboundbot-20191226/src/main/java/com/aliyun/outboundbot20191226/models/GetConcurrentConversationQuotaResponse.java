// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetConcurrentConversationQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetConcurrentConversationQuotaResponseBody body;

    public static GetConcurrentConversationQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConcurrentConversationQuotaResponse self = new GetConcurrentConversationQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetConcurrentConversationQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConcurrentConversationQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConcurrentConversationQuotaResponse setBody(GetConcurrentConversationQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConcurrentConversationQuotaResponseBody getBody() {
        return this.body;
    }

}
