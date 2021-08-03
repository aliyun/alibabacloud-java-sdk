// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeMixedCardsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeMixedCardsResponseBody body;

    public static RecognizeMixedCardsResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMixedCardsResponse self = new RecognizeMixedCardsResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeMixedCardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeMixedCardsResponse setBody(RecognizeMixedCardsResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeMixedCardsResponseBody getBody() {
        return this.body;
    }

}
