// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UpdateAttachedMediaInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAttachedMediaInfosResponseBody body;

    public static UpdateAttachedMediaInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAttachedMediaInfosResponse self = new UpdateAttachedMediaInfosResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAttachedMediaInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAttachedMediaInfosResponse setBody(UpdateAttachedMediaInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAttachedMediaInfosResponseBody getBody() {
        return this.body;
    }

}
