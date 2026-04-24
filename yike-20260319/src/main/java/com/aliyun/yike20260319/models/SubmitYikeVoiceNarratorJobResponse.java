// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikeVoiceNarratorJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitYikeVoiceNarratorJobResponseBody body;

    public static SubmitYikeVoiceNarratorJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikeVoiceNarratorJobResponse self = new SubmitYikeVoiceNarratorJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitYikeVoiceNarratorJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitYikeVoiceNarratorJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitYikeVoiceNarratorJobResponse setBody(SubmitYikeVoiceNarratorJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitYikeVoiceNarratorJobResponseBody getBody() {
        return this.body;
    }

}
