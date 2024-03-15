// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEduPaperStructedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeEduPaperStructedResponseBody body;

    public static RecognizeEduPaperStructedResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeEduPaperStructedResponse self = new RecognizeEduPaperStructedResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeEduPaperStructedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeEduPaperStructedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeEduPaperStructedResponse setBody(RecognizeEduPaperStructedResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeEduPaperStructedResponseBody getBody() {
        return this.body;
    }

}
