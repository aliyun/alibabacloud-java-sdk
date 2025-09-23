// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20210112.models;

import com.aliyun.tea.*;

public class RevokeFeedbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RevokeFeedbackResponseBody body;

    public static RevokeFeedbackResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeFeedbackResponse self = new RevokeFeedbackResponse();
        return TeaModel.build(map, self);
    }

    public RevokeFeedbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeFeedbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeFeedbackResponse setBody(RevokeFeedbackResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeFeedbackResponseBody getBody() {
        return this.body;
    }

}
