// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateVideoInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateVideoInfoResponseBody body;

    public static UpdateVideoInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVideoInfoResponse self = new UpdateVideoInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVideoInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVideoInfoResponse setBody(UpdateVideoInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVideoInfoResponseBody getBody() {
        return this.body;
    }

}
