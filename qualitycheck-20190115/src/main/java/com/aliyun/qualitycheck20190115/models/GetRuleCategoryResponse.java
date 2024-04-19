// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRuleCategoryResponseBody body;

    public static GetRuleCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRuleCategoryResponse self = new GetRuleCategoryResponse();
        return TeaModel.build(map, self);
    }

    public GetRuleCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRuleCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRuleCategoryResponse setBody(GetRuleCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRuleCategoryResponseBody getBody() {
        return this.body;
    }

}
