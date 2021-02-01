// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SampleListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SampleListResponseBody body;

    public static SampleListResponse build(java.util.Map<String, ?> map) throws Exception {
        SampleListResponse self = new SampleListResponse();
        return TeaModel.build(map, self);
    }

    public SampleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SampleListResponse setBody(SampleListResponseBody body) {
        this.body = body;
        return this;
    }
    public SampleListResponseBody getBody() {
        return this.body;
    }

}
