// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeTakeoutOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeTakeoutOrderResponseBody body;

    public static RecognizeTakeoutOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTakeoutOrderResponse self = new RecognizeTakeoutOrderResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeTakeoutOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeTakeoutOrderResponse setBody(RecognizeTakeoutOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeTakeoutOrderResponseBody getBody() {
        return this.body;
    }

}
