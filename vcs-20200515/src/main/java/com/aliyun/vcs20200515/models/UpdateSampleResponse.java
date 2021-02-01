// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateSampleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSampleResponseBody body;

    public static UpdateSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSampleResponse self = new UpdateSampleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSampleResponse setBody(UpdateSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSampleResponseBody getBody() {
        return this.body;
    }

}
