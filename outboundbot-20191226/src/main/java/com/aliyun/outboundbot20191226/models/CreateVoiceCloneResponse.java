// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateVoiceCloneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVoiceCloneResponseBody body;

    public static CreateVoiceCloneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVoiceCloneResponse self = new CreateVoiceCloneResponse();
        return TeaModel.build(map, self);
    }

    public CreateVoiceCloneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVoiceCloneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVoiceCloneResponse setBody(CreateVoiceCloneResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVoiceCloneResponseBody getBody() {
        return this.body;
    }

}
