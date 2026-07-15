// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707.models;

import com.aliyun.tea.*;

public class SubmitImageGenerationJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitImageGenerationJobResponseBody body;

    public static SubmitImageGenerationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitImageGenerationJobResponse self = new SubmitImageGenerationJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitImageGenerationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitImageGenerationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitImageGenerationJobResponse setBody(SubmitImageGenerationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitImageGenerationJobResponseBody getBody() {
        return this.body;
    }

}
