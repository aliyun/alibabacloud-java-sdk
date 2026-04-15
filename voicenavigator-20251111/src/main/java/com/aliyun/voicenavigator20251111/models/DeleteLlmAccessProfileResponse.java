// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class DeleteLlmAccessProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLlmAccessProfileResponseBody body;

    public static DeleteLlmAccessProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLlmAccessProfileResponse self = new DeleteLlmAccessProfileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLlmAccessProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLlmAccessProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLlmAccessProfileResponse setBody(DeleteLlmAccessProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLlmAccessProfileResponseBody getBody() {
        return this.body;
    }

}
