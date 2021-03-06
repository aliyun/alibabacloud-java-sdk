// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class ReconstructBodyBySingleImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReconstructBodyBySingleImageResponseBody body;

    public static ReconstructBodyBySingleImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ReconstructBodyBySingleImageResponse self = new ReconstructBodyBySingleImageResponse();
        return TeaModel.build(map, self);
    }

    public ReconstructBodyBySingleImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReconstructBodyBySingleImageResponse setBody(ReconstructBodyBySingleImageResponseBody body) {
        this.body = body;
        return this;
    }
    public ReconstructBodyBySingleImageResponseBody getBody() {
        return this.body;
    }

}
