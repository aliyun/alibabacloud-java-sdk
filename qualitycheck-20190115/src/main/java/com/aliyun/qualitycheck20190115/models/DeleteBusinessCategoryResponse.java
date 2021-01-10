// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteBusinessCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBusinessCategoryResponseBody body;

    public static DeleteBusinessCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBusinessCategoryResponse self = new DeleteBusinessCategoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBusinessCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBusinessCategoryResponse setBody(DeleteBusinessCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBusinessCategoryResponseBody getBody() {
        return this.body;
    }

}
