// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteCASSlsConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCASSlsConfigResponseBody body;

    public static DeleteCASSlsConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCASSlsConfigResponse self = new DeleteCASSlsConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCASSlsConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCASSlsConfigResponse setBody(DeleteCASSlsConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCASSlsConfigResponseBody getBody() {
        return this.body;
    }

}
