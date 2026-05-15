// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikePromptExpansionVoiceFixJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetYikePromptExpansionVoiceFixJobResponseBody body;

    public static GetYikePromptExpansionVoiceFixJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetYikePromptExpansionVoiceFixJobResponse self = new GetYikePromptExpansionVoiceFixJobResponse();
        return TeaModel.build(map, self);
    }

    public GetYikePromptExpansionVoiceFixJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetYikePromptExpansionVoiceFixJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetYikePromptExpansionVoiceFixJobResponse setBody(GetYikePromptExpansionVoiceFixJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetYikePromptExpansionVoiceFixJobResponseBody getBody() {
        return this.body;
    }

}
