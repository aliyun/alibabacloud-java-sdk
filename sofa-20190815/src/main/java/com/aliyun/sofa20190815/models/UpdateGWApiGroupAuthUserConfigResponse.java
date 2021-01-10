// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateGWApiGroupAuthUserConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateGWApiGroupAuthUserConfigResponseBody body;

    public static UpdateGWApiGroupAuthUserConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGWApiGroupAuthUserConfigResponse self = new UpdateGWApiGroupAuthUserConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGWApiGroupAuthUserConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGWApiGroupAuthUserConfigResponse setBody(UpdateGWApiGroupAuthUserConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGWApiGroupAuthUserConfigResponseBody getBody() {
        return this.body;
    }

}
