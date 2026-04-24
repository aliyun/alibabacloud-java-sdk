// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class GetYikeVoiceNarratorJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetYikeVoiceNarratorJobResponseBody body;

    public static GetYikeVoiceNarratorJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetYikeVoiceNarratorJobResponse self = new GetYikeVoiceNarratorJobResponse();
        return TeaModel.build(map, self);
    }

    public GetYikeVoiceNarratorJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetYikeVoiceNarratorJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetYikeVoiceNarratorJobResponse setBody(GetYikeVoiceNarratorJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetYikeVoiceNarratorJobResponseBody getBody() {
        return this.body;
    }

}
