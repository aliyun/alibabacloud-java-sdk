// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class UpdateLlmAccessProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLlmAccessProfileResponseBody body;

    public static UpdateLlmAccessProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLlmAccessProfileResponse self = new UpdateLlmAccessProfileResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLlmAccessProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLlmAccessProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLlmAccessProfileResponse setBody(UpdateLlmAccessProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLlmAccessProfileResponseBody getBody() {
        return this.body;
    }

}
