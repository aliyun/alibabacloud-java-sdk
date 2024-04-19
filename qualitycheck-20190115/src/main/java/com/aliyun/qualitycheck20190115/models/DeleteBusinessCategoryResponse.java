// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteBusinessCategoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteBusinessCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBusinessCategoryResponse setBody(DeleteBusinessCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBusinessCategoryResponseBody getBody() {
        return this.body;
    }

}
