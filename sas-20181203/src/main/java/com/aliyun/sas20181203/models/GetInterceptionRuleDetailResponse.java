// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetInterceptionRuleDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInterceptionRuleDetailResponseBody body;

    public static GetInterceptionRuleDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInterceptionRuleDetailResponse self = new GetInterceptionRuleDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetInterceptionRuleDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInterceptionRuleDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInterceptionRuleDetailResponse setBody(GetInterceptionRuleDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInterceptionRuleDetailResponseBody getBody() {
        return this.body;
    }

}
