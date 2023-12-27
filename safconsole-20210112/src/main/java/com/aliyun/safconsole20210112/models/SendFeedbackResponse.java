// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20210112.models;

import com.aliyun.tea.*;

public class SendFeedbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendFeedbackResponseBody body;

    public static SendFeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        SendFeedbackResponse self = new SendFeedbackResponse();
        return TeaModel.build(map, self);
    }

    public SendFeedbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendFeedbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendFeedbackResponse setBody(SendFeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public SendFeedbackResponseBody getBody() {
        return this.body;
    }

}
