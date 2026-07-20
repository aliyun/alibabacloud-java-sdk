// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetSecuritySuggestionNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecuritySuggestionNumberResponseBody body;

    public static GetSecuritySuggestionNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecuritySuggestionNumberResponse self = new GetSecuritySuggestionNumberResponse();
        return TeaModel.build(map, self);
    }

    public GetSecuritySuggestionNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecuritySuggestionNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecuritySuggestionNumberResponse setBody(GetSecuritySuggestionNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecuritySuggestionNumberResponseBody getBody() {
        return this.body;
    }

}
