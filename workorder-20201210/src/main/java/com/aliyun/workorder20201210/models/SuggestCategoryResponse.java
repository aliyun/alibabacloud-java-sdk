// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20201210.models;

import com.aliyun.tea.*;

public class SuggestCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SuggestCategoryResponseBody body;

    public static SuggestCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        SuggestCategoryResponse self = new SuggestCategoryResponse();
        return TeaModel.build(map, self);
    }

    public SuggestCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuggestCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SuggestCategoryResponse setBody(SuggestCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public SuggestCategoryResponseBody getBody() {
        return this.body;
    }

}
