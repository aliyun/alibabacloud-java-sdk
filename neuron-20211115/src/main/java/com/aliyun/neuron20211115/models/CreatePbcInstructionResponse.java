// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreatePbcInstructionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcInstruction body;

    public static CreatePbcInstructionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePbcInstructionResponse self = new CreatePbcInstructionResponse();
        return TeaModel.build(map, self);
    }

    public CreatePbcInstructionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePbcInstructionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePbcInstructionResponse setBody(PbcInstruction body) {
        this.body = body;
        return this;
    }
    public PbcInstruction getBody() {
        return this.body;
    }

}
