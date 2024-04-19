// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AddRuleCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddRuleCategoryResponseBody body;

    public static AddRuleCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRuleCategoryResponse self = new AddRuleCategoryResponse();
        return TeaModel.build(map, self);
    }

    public AddRuleCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRuleCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRuleCategoryResponse setBody(AddRuleCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRuleCategoryResponseBody getBody() {
        return this.body;
    }

}
