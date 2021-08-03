// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEduPaperCutResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RecognizeEduPaperCutResponse setBody(RecognizeEduPaperCutResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeEduPaperCutResponseBody getBody() {
        return this.body;
    }

}
