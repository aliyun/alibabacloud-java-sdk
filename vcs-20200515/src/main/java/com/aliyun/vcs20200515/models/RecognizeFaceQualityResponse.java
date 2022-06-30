// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RecognizeFaceQualityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeFaceQualityResponseBody body;

    public static RecognizeFaceQualityResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFaceQualityResponse self = new RecognizeFaceQualityResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeFaceQualityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeFaceQualityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeFaceQualityResponse setBody(RecognizeFaceQualityResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeFaceQualityResponseBody getBody() {
        return this.body;
    }

}
