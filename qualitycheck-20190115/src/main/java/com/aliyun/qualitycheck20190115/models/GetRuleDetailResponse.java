// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRuleDetailResponseBody body;

    public static GetRuleDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRuleDetailResponse self = new GetRuleDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetRuleDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRuleDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRuleDetailResponse setBody(GetRuleDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRuleDetailResponseBody getBody() {
        return this.body;
    }

}
