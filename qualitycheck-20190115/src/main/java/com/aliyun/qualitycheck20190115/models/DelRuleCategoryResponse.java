// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DelRuleCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DelRuleCategoryResponseBody body;

    public static DelRuleCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DelRuleCategoryResponse self = new DelRuleCategoryResponse();
        return TeaModel.build(map, self);
    }

    public DelRuleCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelRuleCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DelRuleCategoryResponse setBody(DelRuleCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DelRuleCategoryResponseBody getBody() {
        return this.body;
    }

}
