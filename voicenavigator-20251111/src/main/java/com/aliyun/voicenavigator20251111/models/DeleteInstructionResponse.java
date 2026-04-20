// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class DeleteInstructionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteInstructionResponseBody body;

    public static DeleteInstructionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstructionResponse self = new DeleteInstructionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstructionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstructionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInstructionResponse setBody(DeleteInstructionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstructionResponseBody getBody() {
        return this.body;
    }

}
