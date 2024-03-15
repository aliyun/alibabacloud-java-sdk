// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeRideHailingItineraryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeRideHailingItineraryResponseBody body;

    public static RecognizeRideHailingItineraryResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeRideHailingItineraryResponse self = new RecognizeRideHailingItineraryResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeRideHailingItineraryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeRideHailingItineraryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeRideHailingItineraryResponse setBody(RecognizeRideHailingItineraryResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeRideHailingItineraryResponseBody getBody() {
        return this.body;
    }

}
