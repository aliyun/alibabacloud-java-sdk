// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteGlobalQuestionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGlobalQuestionResponseBody body;

    public static DeleteGlobalQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGlobalQuestionResponse self = new DeleteGlobalQuestionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGlobalQuestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGlobalQuestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGlobalQuestionResponse setBody(DeleteGlobalQuestionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGlobalQuestionResponseBody getBody() {
        return this.body;
    }

}
