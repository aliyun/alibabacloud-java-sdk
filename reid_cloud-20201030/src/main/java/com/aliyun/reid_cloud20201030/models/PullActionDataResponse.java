// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class PullActionDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PullActionDataResponseBody body;

    public static PullActionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        PullActionDataResponse self = new PullActionDataResponse();
        return TeaModel.build(map, self);
    }

    public PullActionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PullActionDataResponse setBody(PullActionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public PullActionDataResponseBody getBody() {
        return this.body;
    }

}
