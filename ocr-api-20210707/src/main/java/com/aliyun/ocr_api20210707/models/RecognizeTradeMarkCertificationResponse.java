// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTradeMarkCertificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeTradeMarkCertificationResponseBody body;

    public static RecognizeTradeMarkCertificationResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTradeMarkCertificationResponse self = new RecognizeTradeMarkCertificationResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeTradeMarkCertificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeTradeMarkCertificationResponse setBody(RecognizeTradeMarkCertificationResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeTradeMarkCertificationResponseBody getBody() {
        return this.body;
    }

}
