// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEduOralCalculationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeEduOralCalculationResponseBody body;

    public static RecognizeEduOralCalculationResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeEduOralCalculationResponse self = new RecognizeEduOralCalculationResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeEduOralCalculationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeEduOralCalculationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeEduOralCalculationResponse setBody(RecognizeEduOralCalculationResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeEduOralCalculationResponseBody getBody() {
        return this.body;
    }

}
