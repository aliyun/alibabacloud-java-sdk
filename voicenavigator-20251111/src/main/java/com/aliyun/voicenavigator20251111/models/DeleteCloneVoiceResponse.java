// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class DeleteCloneVoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCloneVoiceResponseBody body;

    public static DeleteCloneVoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloneVoiceResponse self = new DeleteCloneVoiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloneVoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloneVoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCloneVoiceResponse setBody(DeleteCloneVoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloneVoiceResponseBody getBody() {
        return this.body;
    }

}
