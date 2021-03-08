// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetImageInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetImageInfoResponseBody body;

    public static GetImageInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetImageInfoResponse self = new GetImageInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetImageInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetImageInfoResponse setBody(GetImageInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetImageInfoResponseBody getBody() {
        return this.body;
    }

}
