// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class PreviewModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PreviewModelResponseBody body;

    public static PreviewModelResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewModelResponse self = new PreviewModelResponse();
        return TeaModel.build(map, self);
    }

    public PreviewModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewModelResponse setBody(PreviewModelResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewModelResponseBody getBody() {
        return this.body;
    }

}
