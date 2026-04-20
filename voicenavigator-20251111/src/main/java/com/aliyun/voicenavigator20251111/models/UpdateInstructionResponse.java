// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class UpdateInstructionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateInstructionResponseBody body;

    public static UpdateInstructionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstructionResponse self = new UpdateInstructionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstructionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstructionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstructionResponse setBody(UpdateInstructionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstructionResponseBody getBody() {
        return this.body;
    }

}
