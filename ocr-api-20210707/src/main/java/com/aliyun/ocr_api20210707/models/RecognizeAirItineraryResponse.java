// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeAirItineraryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RecognizeAirItineraryResponse setBody(RecognizeAirItineraryResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeAirItineraryResponseBody getBody() {
        return this.body;
    }

}
