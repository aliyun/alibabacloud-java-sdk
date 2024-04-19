// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AddBusinessCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddBusinessCategoryResponseBody body;

    public static AddBusinessCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBusinessCategoryResponse self = new AddBusinessCategoryResponse();
        return TeaModel.build(map, self);
    }

    public AddBusinessCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBusinessCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBusinessCategoryResponse setBody(AddBusinessCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBusinessCategoryResponseBody getBody() {
        return this.body;
    }

}
