// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitDigitalWatermarkExtractJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitDigitalWatermarkExtractJobResponseBody body;

    public static SubmitDigitalWatermarkExtractJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitDigitalWatermarkExtractJobResponse self = new SubmitDigitalWatermarkExtractJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitDigitalWatermarkExtractJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitDigitalWatermarkExtractJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitDigitalWatermarkExtractJobResponse setBody(SubmitDigitalWatermarkExtractJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitDigitalWatermarkExtractJobResponseBody getBody() {
        return this.body;
    }

}
