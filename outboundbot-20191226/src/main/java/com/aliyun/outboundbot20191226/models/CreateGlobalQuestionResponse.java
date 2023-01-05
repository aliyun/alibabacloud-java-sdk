// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateGlobalQuestionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateGlobalQuestionResponseBody body;

    public static CreateGlobalQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGlobalQuestionResponse self = new CreateGlobalQuestionResponse();
        return TeaModel.build(map, self);
    }

    public CreateGlobalQuestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGlobalQuestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGlobalQuestionResponse setBody(CreateGlobalQuestionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGlobalQuestionResponseBody getBody() {
        return this.body;
    }

}
