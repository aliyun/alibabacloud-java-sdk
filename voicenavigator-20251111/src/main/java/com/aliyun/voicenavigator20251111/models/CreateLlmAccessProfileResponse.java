// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class CreateLlmAccessProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLlmAccessProfileResponseBody body;

    public static CreateLlmAccessProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLlmAccessProfileResponse self = new CreateLlmAccessProfileResponse();
        return TeaModel.build(map, self);
    }

    public CreateLlmAccessProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLlmAccessProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLlmAccessProfileResponse setBody(CreateLlmAccessProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLlmAccessProfileResponseBody getBody() {
        return this.body;
    }

}
