// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetDeviceCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceCountResponseBody body;

    public static GetDeviceCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceCountResponse self = new GetDeviceCountResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceCountResponse setBody(GetDeviceCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceCountResponseBody getBody() {
        return this.body;
    }

}
