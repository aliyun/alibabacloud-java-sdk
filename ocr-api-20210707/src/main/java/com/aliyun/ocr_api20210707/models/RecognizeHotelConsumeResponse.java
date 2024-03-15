// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeHotelConsumeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeHotelConsumeResponseBody body;

    public static RecognizeHotelConsumeResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeHotelConsumeResponse self = new RecognizeHotelConsumeResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeHotelConsumeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeHotelConsumeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeHotelConsumeResponse setBody(RecognizeHotelConsumeResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeHotelConsumeResponseBody getBody() {
        return this.body;
    }

}
