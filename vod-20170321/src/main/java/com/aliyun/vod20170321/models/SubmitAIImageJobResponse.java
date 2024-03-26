// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIImageJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAIImageJobResponseBody body;

    public static SubmitAIImageJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIImageJobResponse self = new SubmitAIImageJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAIImageJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAIImageJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAIImageJobResponse setBody(SubmitAIImageJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAIImageJobResponseBody getBody() {
        return this.body;
    }

}
