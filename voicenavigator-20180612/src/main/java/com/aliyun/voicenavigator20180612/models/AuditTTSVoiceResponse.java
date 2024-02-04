// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class AuditTTSVoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuditTTSVoiceResponseBody body;

    public static AuditTTSVoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        AuditTTSVoiceResponse self = new AuditTTSVoiceResponse();
        return TeaModel.build(map, self);
    }

    public AuditTTSVoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuditTTSVoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuditTTSVoiceResponse setBody(AuditTTSVoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public AuditTTSVoiceResponseBody getBody() {
        return this.body;
    }

}
