// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTableOcrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeTableOcrResponseBody body;

    public static RecognizeTableOcrResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTableOcrResponse self = new RecognizeTableOcrResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeTableOcrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeTableOcrResponse setBody(RecognizeTableOcrResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeTableOcrResponseBody getBody() {
        return this.body;
    }

}
