// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateStreamInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateStreamInfoResponseBody body;

    public static UpdateStreamInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStreamInfoResponse self = new UpdateStreamInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStreamInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStreamInfoResponse setBody(UpdateStreamInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStreamInfoResponseBody getBody() {
        return this.body;
    }

}
