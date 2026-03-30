// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class DeleteVoiceAccessProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVoiceAccessProfileResponseBody body;

    public static DeleteVoiceAccessProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVoiceAccessProfileResponse self = new DeleteVoiceAccessProfileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVoiceAccessProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVoiceAccessProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVoiceAccessProfileResponse setBody(DeleteVoiceAccessProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVoiceAccessProfileResponseBody getBody() {
        return this.body;
    }

}
