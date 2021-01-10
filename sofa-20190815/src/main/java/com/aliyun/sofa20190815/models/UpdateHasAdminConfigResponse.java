// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasAdminConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasAdminConfigResponseBody body;

    public static UpdateHasAdminConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasAdminConfigResponse self = new UpdateHasAdminConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasAdminConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasAdminConfigResponse setBody(UpdateHasAdminConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasAdminConfigResponseBody getBody() {
        return this.body;
    }

}
