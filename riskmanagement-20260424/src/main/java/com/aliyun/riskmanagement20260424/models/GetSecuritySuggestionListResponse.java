// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetSecuritySuggestionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSecuritySuggestionListResponseBody body;

    public static GetSecuritySuggestionListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSecuritySuggestionListResponse self = new GetSecuritySuggestionListResponse();
        return TeaModel.build(map, self);
    }

    public GetSecuritySuggestionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSecuritySuggestionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSecuritySuggestionListResponse setBody(GetSecuritySuggestionListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSecuritySuggestionListResponseBody getBody() {
        return this.body;
    }

}
