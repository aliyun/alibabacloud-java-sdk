// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDevicePictureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDevicePictureResponseBody body;

    public static GetDevicePictureResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDevicePictureResponse self = new GetDevicePictureResponse();
        return TeaModel.build(map, self);
    }

    public GetDevicePictureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDevicePictureResponse setBody(GetDevicePictureResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDevicePictureResponseBody getBody() {
        return this.body;
    }

}
