// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitLiveEditingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitLiveEditingResponseBody body;

    public static SubmitLiveEditingResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitLiveEditingResponse self = new SubmitLiveEditingResponse();
        return TeaModel.build(map, self);
    }

    public SubmitLiveEditingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitLiveEditingResponse setBody(SubmitLiveEditingResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitLiveEditingResponseBody getBody() {
        return this.body;
    }

}
