// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateStoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateStoryResponseBody body;

    public static CreateStoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStoryResponse self = new CreateStoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateStoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateStoryResponse setBody(CreateStoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStoryResponseBody getBody() {
        return this.body;
    }

}
