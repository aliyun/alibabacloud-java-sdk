// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class InsertTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InsertTagsResponseBody body;

    public static InsertTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertTagsResponse self = new InsertTagsResponse();
        return TeaModel.build(map, self);
    }

    public InsertTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertTagsResponse setBody(InsertTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertTagsResponseBody getBody() {
        return this.body;
    }

}
