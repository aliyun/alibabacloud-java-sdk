// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class TextToVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TextToVideoResponseBody body;

    public static TextToVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        TextToVideoResponse self = new TextToVideoResponse();
        return TeaModel.build(map, self);
    }

    public TextToVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TextToVideoResponse setBody(TextToVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public TextToVideoResponseBody getBody() {
        return this.body;
    }

}
