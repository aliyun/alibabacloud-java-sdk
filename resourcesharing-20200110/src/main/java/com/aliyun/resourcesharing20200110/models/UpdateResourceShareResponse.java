// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class UpdateResourceShareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateResourceShareResponseBody body;

    public static UpdateResourceShareResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceShareResponse self = new UpdateResourceShareResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceShareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceShareResponse setBody(UpdateResourceShareResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceShareResponseBody getBody() {
        return this.body;
    }

}
