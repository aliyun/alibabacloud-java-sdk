// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveAfterAnswerDelayPlaybackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveAfterAnswerDelayPlaybackResponseBody body;

    public static SaveAfterAnswerDelayPlaybackResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveAfterAnswerDelayPlaybackResponse self = new SaveAfterAnswerDelayPlaybackResponse();
        return TeaModel.build(map, self);
    }

    public SaveAfterAnswerDelayPlaybackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveAfterAnswerDelayPlaybackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveAfterAnswerDelayPlaybackResponse setBody(SaveAfterAnswerDelayPlaybackResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveAfterAnswerDelayPlaybackResponseBody getBody() {
        return this.body;
    }

}
