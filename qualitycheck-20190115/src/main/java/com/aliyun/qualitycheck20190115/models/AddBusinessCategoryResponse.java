// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AddBusinessCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddBusinessCategoryResponse setBody(AddBusinessCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBusinessCategoryResponseBody getBody() {
        return this.body;
    }

}
