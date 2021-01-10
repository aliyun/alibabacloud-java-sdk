// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasAdminConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasAdminConfigResponseBody body;

    public static DeleteHasAdminConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasAdminConfigResponse self = new DeleteHasAdminConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasAdminConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasAdminConfigResponse setBody(DeleteHasAdminConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasAdminConfigResponseBody getBody() {
        return this.body;
    }

}
