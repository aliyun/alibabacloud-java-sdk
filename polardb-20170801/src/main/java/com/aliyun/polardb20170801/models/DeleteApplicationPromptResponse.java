// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteApplicationPromptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApplicationPromptResponseBody body;

    public static DeleteApplicationPromptResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationPromptResponse self = new DeleteApplicationPromptResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationPromptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApplicationPromptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApplicationPromptResponse setBody(DeleteApplicationPromptResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApplicationPromptResponseBody getBody() {
        return this.body;
    }

}
