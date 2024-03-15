// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEduQuestionOcrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeEduQuestionOcrResponseBody body;

    public static RecognizeEduQuestionOcrResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeEduQuestionOcrResponse self = new RecognizeEduQuestionOcrResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeEduQuestionOcrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeEduQuestionOcrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeEduQuestionOcrResponse setBody(RecognizeEduQuestionOcrResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeEduQuestionOcrResponseBody getBody() {
        return this.body;
    }

}
