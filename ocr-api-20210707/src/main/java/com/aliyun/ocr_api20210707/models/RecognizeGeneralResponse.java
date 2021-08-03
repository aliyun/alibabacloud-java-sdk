// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeGeneralResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeGeneralResponseBody body;

    public static RecognizeGeneralResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeGeneralResponse self = new RecognizeGeneralResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeGeneralResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeGeneralResponse setBody(RecognizeGeneralResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeGeneralResponseBody getBody() {
        return this.body;
    }

}
