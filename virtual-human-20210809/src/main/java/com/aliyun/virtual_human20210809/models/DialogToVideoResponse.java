// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.virtual_human20210809.models;

import com.aliyun.tea.*;

public class DialogToVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DialogToVideoResponseBody body;

    public static DialogToVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        DialogToVideoResponse self = new DialogToVideoResponse();
        return TeaModel.build(map, self);
    }

    public DialogToVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DialogToVideoResponse setBody(DialogToVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public DialogToVideoResponseBody getBody() {
        return this.body;
    }

}
