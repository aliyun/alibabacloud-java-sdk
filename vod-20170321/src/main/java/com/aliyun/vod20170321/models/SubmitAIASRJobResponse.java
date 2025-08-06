// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIASRJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitAIASRJobResponseBody body;

    public static SubmitAIASRJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIASRJobResponse self = new SubmitAIASRJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAIASRJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAIASRJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitAIASRJobResponse setBody(SubmitAIASRJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAIASRJobResponseBody getBody() {
        return this.body;
    }

}
