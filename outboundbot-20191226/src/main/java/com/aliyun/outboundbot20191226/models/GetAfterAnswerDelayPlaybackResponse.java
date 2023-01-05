// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAfterAnswerDelayPlaybackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAfterAnswerDelayPlaybackResponseBody body;

    public static GetAfterAnswerDelayPlaybackResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAfterAnswerDelayPlaybackResponse self = new GetAfterAnswerDelayPlaybackResponse();
        return TeaModel.build(map, self);
    }

    public GetAfterAnswerDelayPlaybackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAfterAnswerDelayPlaybackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAfterAnswerDelayPlaybackResponse setBody(GetAfterAnswerDelayPlaybackResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAfterAnswerDelayPlaybackResponseBody getBody() {
        return this.body;
    }

}
