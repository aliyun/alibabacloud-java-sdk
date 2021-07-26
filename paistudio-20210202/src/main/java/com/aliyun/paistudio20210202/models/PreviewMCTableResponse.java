// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class PreviewMCTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PreviewMCTableResponseBody body;

    public static PreviewMCTableResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewMCTableResponse self = new PreviewMCTableResponse();
        return TeaModel.build(map, self);
    }

    public PreviewMCTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewMCTableResponse setBody(PreviewMCTableResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewMCTableResponseBody getBody() {
        return this.body;
    }

}
