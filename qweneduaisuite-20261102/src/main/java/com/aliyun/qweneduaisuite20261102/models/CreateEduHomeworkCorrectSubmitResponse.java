// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qweneduaisuite20261102.models;

import com.aliyun.tea.*;

public class CreateEduHomeworkCorrectSubmitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEduHomeworkCorrectSubmitResponseBody body;

    public static CreateEduHomeworkCorrectSubmitResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEduHomeworkCorrectSubmitResponse self = new CreateEduHomeworkCorrectSubmitResponse();
        return TeaModel.build(map, self);
    }

    public CreateEduHomeworkCorrectSubmitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEduHomeworkCorrectSubmitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEduHomeworkCorrectSubmitResponse setBody(CreateEduHomeworkCorrectSubmitResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEduHomeworkCorrectSubmitResponseBody getBody() {
        return this.body;
    }

}
