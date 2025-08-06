// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIVideoTagJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAIVideoTagJobResponseBody body;

    public static SubmitAIVideoTagJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIVideoTagJobResponse self = new SubmitAIVideoTagJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAIVideoTagJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAIVideoTagJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAIVideoTagJobResponse setBody(SubmitAIVideoTagJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAIVideoTagJobResponseBody getBody() {
        return this.body;
    }

}
