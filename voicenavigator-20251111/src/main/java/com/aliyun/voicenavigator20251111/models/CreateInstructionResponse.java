// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class CreateInstructionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateInstructionResponseBody body;

    public static CreateInstructionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstructionResponse self = new CreateInstructionResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstructionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstructionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstructionResponse setBody(CreateInstructionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstructionResponseBody getBody() {
        return this.body;
    }

}
