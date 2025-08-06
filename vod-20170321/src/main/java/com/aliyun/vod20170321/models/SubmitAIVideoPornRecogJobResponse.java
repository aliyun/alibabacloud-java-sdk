// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoPornRecogJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAIVideoPornRecogJobResponseBody body;

    public static SubmitAIVideoPornRecogJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoPornRecogJobResponse self = new SubmitAIVideoPornRecogJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoPornRecogJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAIVideoPornRecogJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAIVideoPornRecogJobResponse setBody(SubmitAIVideoPornRecogJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAIVideoPornRecogJobResponseBody getBody() {
        return this.body;
    }

}
