// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddCategoryResponseBody body;

    public static AddCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCategoryResponse self = new AddCategoryResponse();
        return TeaModel.build(map, self);
    }

    public AddCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCategoryResponse setBody(AddCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCategoryResponseBody getBody() {
        return this.body;
    }

}
