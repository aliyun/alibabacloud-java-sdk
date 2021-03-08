// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAttachedMediaInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAttachedMediaInfoResponseBody body;

    public static GetAttachedMediaInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAttachedMediaInfoResponse self = new GetAttachedMediaInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAttachedMediaInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAttachedMediaInfoResponse setBody(GetAttachedMediaInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAttachedMediaInfoResponseBody getBody() {
        return this.body;
    }

}
