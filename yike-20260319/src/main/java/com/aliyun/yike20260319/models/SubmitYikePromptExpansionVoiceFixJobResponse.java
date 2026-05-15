// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitYikePromptExpansionVoiceFixJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitYikePromptExpansionVoiceFixJobResponseBody body;

    public static SubmitYikePromptExpansionVoiceFixJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikePromptExpansionVoiceFixJobResponse self = new SubmitYikePromptExpansionVoiceFixJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitYikePromptExpansionVoiceFixJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitYikePromptExpansionVoiceFixJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitYikePromptExpansionVoiceFixJobResponse setBody(SubmitYikePromptExpansionVoiceFixJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitYikePromptExpansionVoiceFixJobResponseBody getBody() {
        return this.body;
    }

}
