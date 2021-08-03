// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeDoctypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeDoctypeResponseBody body;

    public static RecognizeDoctypeResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeDoctypeResponse self = new RecognizeDoctypeResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeDoctypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeDoctypeResponse setBody(RecognizeDoctypeResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeDoctypeResponseBody getBody() {
        return this.body;
    }

}
