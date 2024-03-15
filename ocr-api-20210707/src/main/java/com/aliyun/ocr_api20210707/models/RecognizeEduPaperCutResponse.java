// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEduPaperCutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeEduPaperCutResponseBody body;

    public static RecognizeEduPaperCutResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeEduPaperCutResponse self = new RecognizeEduPaperCutResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeEduPaperCutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeEduPaperCutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeEduPaperCutResponse setBody(RecognizeEduPaperCutResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeEduPaperCutResponseBody getBody() {
        return this.body;
    }

}
