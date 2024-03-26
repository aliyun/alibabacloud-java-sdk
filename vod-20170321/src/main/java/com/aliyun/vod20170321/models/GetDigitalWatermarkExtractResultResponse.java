// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetDigitalWatermarkExtractResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDigitalWatermarkExtractResultResponseBody body;

    public static GetDigitalWatermarkExtractResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDigitalWatermarkExtractResultResponse self = new GetDigitalWatermarkExtractResultResponse();
        return TeaModel.build(map, self);
    }

    public GetDigitalWatermarkExtractResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDigitalWatermarkExtractResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDigitalWatermarkExtractResultResponse setBody(GetDigitalWatermarkExtractResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDigitalWatermarkExtractResultResponseBody getBody() {
        return this.body;
    }

}
