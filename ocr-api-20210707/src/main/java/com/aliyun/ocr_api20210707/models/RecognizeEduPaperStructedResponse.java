// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEduPaperStructedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RecognizeEduPaperStructedResponse setBody(RecognizeEduPaperStructedResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeEduPaperStructedResponseBody getBody() {
        return this.body;
    }

}
