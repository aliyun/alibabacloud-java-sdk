// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceConfigResponseBody body;

    public static GetDeviceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceConfigResponse self = new GetDeviceConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceConfigResponse setBody(GetDeviceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceConfigResponseBody getBody() {
        return this.body;
    }

}
