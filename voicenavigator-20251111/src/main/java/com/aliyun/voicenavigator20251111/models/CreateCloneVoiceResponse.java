// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class CreateCloneVoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCloneVoiceResponseBody body;

    public static CreateCloneVoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCloneVoiceResponse self = new CreateCloneVoiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateCloneVoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCloneVoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCloneVoiceResponse setBody(CreateCloneVoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCloneVoiceResponseBody getBody() {
        return this.body;
    }

}
