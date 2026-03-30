// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class UpdateVoiceAccessProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVoiceAccessProfileResponseBody body;

    public static UpdateVoiceAccessProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVoiceAccessProfileResponse self = new UpdateVoiceAccessProfileResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVoiceAccessProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVoiceAccessProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVoiceAccessProfileResponse setBody(UpdateVoiceAccessProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVoiceAccessProfileResponseBody getBody() {
        return this.body;
    }

}
