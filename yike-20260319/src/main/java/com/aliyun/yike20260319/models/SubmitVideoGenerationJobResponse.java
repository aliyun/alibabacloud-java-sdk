// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class SubmitVideoGenerationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitVideoGenerationJobResponseBody body;

    public static SubmitVideoGenerationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoGenerationJobResponse self = new SubmitVideoGenerationJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitVideoGenerationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitVideoGenerationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitVideoGenerationJobResponse setBody(SubmitVideoGenerationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitVideoGenerationJobResponseBody getBody() {
        return this.body;
    }

}
