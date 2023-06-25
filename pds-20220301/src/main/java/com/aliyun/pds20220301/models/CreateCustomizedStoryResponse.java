// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CreateCustomizedStoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCustomizedStoryResponseBody body;

    public static CreateCustomizedStoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomizedStoryResponse self = new CreateCustomizedStoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomizedStoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomizedStoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomizedStoryResponse setBody(CreateCustomizedStoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomizedStoryResponseBody getBody() {
        return this.body;
    }

}
