// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RecognizeImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeImageResponseBody body;

    public static RecognizeImageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeImageResponse self = new RecognizeImageResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeImageResponse setBody(RecognizeImageResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeImageResponseBody getBody() {
        return this.body;
    }

}
