// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateCASApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCASApplicationResponseBody body;

    public static UpdateCASApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCASApplicationResponse self = new UpdateCASApplicationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCASApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCASApplicationResponse setBody(UpdateCASApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCASApplicationResponseBody getBody() {
        return this.body;
    }

}
