// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class CreateVoiceAccessProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVoiceAccessProfileResponseBody body;

    public static CreateVoiceAccessProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVoiceAccessProfileResponse self = new CreateVoiceAccessProfileResponse();
        return TeaModel.build(map, self);
    }

    public CreateVoiceAccessProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVoiceAccessProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVoiceAccessProfileResponse setBody(CreateVoiceAccessProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVoiceAccessProfileResponseBody getBody() {
        return this.body;
    }

}
