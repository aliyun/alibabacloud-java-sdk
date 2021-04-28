// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class UpdateInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInstanceResponseBody body;

    public static UpdateInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceResponse self = new UpdateInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceResponse setBody(UpdateInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceResponseBody getBody() {
        return this.body;
    }

}
