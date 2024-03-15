// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeChinesePassportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeChinesePassportResponseBody body;

    public static RecognizeChinesePassportResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeChinesePassportResponse self = new RecognizeChinesePassportResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeChinesePassportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeChinesePassportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeChinesePassportResponse setBody(RecognizeChinesePassportResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeChinesePassportResponseBody getBody() {
        return this.body;
    }

}
