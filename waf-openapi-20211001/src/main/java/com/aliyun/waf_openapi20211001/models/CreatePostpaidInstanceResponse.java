// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreatePostpaidInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePostpaidInstanceResponseBody body;

    public static CreatePostpaidInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePostpaidInstanceResponse self = new CreatePostpaidInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreatePostpaidInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePostpaidInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePostpaidInstanceResponse setBody(CreatePostpaidInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePostpaidInstanceResponseBody getBody() {
        return this.body;
    }

}
