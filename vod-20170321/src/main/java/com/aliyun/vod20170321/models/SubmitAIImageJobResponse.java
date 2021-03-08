// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitAIImageJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitAIImageJobResponseBody body;

    public static SubmitAIImageJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIImageJobResponse self = new SubmitAIImageJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitAIImageJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitAIImageJobResponse setBody(SubmitAIImageJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitAIImageJobResponseBody getBody() {
        return this.body;
    }

}
