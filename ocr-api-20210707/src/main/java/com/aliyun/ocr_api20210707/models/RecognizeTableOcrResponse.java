// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTableOcrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RecognizeTableOcrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeTableOcrResponse setBody(RecognizeTableOcrResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeTableOcrResponseBody getBody() {
        return this.body;
    }

}
