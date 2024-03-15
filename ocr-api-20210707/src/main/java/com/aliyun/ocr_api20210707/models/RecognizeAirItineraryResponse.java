// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeAirItineraryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeAirItineraryResponseBody body;

    public static RecognizeAirItineraryResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAirItineraryResponse self = new RecognizeAirItineraryResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeAirItineraryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeAirItineraryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeAirItineraryResponse setBody(RecognizeAirItineraryResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeAirItineraryResponseBody getBody() {
        return this.body;
    }

}
