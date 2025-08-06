// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoFaceRecogJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAIVideoFaceRecogJobResponseBody body;

    public static SubmitAIVideoFaceRecogJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoFaceRecogJobResponse self = new SubmitAIVideoFaceRecogJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoFaceRecogJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAIVideoFaceRecogJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAIVideoFaceRecogJobResponse setBody(SubmitAIVideoFaceRecogJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAIVideoFaceRecogJobResponseBody getBody() {
        return this.body;
    }

}
