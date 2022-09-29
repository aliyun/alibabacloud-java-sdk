// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetPbcInstructionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPbcInstructionResponseBody body;

    public static GetPbcInstructionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPbcInstructionResponse self = new GetPbcInstructionResponse();
        return TeaModel.build(map, self);
    }

    public GetPbcInstructionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPbcInstructionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPbcInstructionResponse setBody(GetPbcInstructionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPbcInstructionResponseBody getBody() {
        return this.body;
    }

}
