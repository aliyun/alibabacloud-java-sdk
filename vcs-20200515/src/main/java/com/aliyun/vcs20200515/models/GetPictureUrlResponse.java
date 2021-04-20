// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetPictureUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPictureUrlResponseBody body;

    public static GetPictureUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPictureUrlResponse self = new GetPictureUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetPictureUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPictureUrlResponse setBody(GetPictureUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPictureUrlResponseBody getBody() {
        return this.body;
    }

}
