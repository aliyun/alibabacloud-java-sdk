// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeAccountPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeAccountPageResponseBody body;

    public static RecognizeAccountPageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAccountPageResponse self = new RecognizeAccountPageResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeAccountPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeAccountPageResponse setBody(RecognizeAccountPageResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeAccountPageResponseBody getBody() {
        return this.body;
    }

}
