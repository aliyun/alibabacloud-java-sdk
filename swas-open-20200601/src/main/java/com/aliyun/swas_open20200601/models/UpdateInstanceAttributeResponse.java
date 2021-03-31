// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class UpdateInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInstanceAttributeResponseBody body;

    public static UpdateInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceAttributeResponse self = new UpdateInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceAttributeResponse setBody(UpdateInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
