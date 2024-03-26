// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAIJobResponseBody body;

    public static SubmitAIJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIJobResponse self = new SubmitAIJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAIJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAIJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAIJobResponse setBody(SubmitAIJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAIJobResponseBody getBody() {
        return this.body;
    }

}
