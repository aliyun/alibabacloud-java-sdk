// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEduPaperOcrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeEduPaperOcrResponseBody body;

    public static RecognizeEduPaperOcrResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeEduPaperOcrResponse self = new RecognizeEduPaperOcrResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeEduPaperOcrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeEduPaperOcrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeEduPaperOcrResponse setBody(RecognizeEduPaperOcrResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeEduPaperOcrResponseBody getBody() {
        return this.body;
    }

}
