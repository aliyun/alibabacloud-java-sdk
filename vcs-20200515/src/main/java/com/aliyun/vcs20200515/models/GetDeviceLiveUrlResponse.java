// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceLiveUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceLiveUrlResponseBody body;

    public static GetDeviceLiveUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceLiveUrlResponse self = new GetDeviceLiveUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceLiveUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceLiveUrlResponse setBody(GetDeviceLiveUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceLiveUrlResponseBody getBody() {
        return this.body;
    }

}
