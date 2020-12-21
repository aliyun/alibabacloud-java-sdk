// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceVideoUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceVideoUrlResponseBody body;

    public static GetDeviceVideoUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceVideoUrlResponse self = new GetDeviceVideoUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceVideoUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceVideoUrlResponse setBody(GetDeviceVideoUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceVideoUrlResponseBody getBody() {
        return this.body;
    }

}
