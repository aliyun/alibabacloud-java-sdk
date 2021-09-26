// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DisableUserConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableUserConfigResponseBody body;

    public static DisableUserConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableUserConfigResponse self = new DisableUserConfigResponse();
        return TeaModel.build(map, self);
    }

    public DisableUserConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableUserConfigResponse setBody(DisableUserConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableUserConfigResponseBody getBody() {
        return this.body;
    }

}
