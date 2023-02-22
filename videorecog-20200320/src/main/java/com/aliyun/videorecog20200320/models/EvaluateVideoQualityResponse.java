// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class EvaluateVideoQualityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EvaluateVideoQualityResponseBody body;

    public static EvaluateVideoQualityResponse build(java.util.Map<String, ?> map) throws Exception {
        EvaluateVideoQualityResponse self = new EvaluateVideoQualityResponse();
        return TeaModel.build(map, self);
    }

    public EvaluateVideoQualityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EvaluateVideoQualityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EvaluateVideoQualityResponse setBody(EvaluateVideoQualityResponseBody body) {
        this.body = body;
        return this;
    }
    public EvaluateVideoQualityResponseBody getBody() {
        return this.body;
    }

}
