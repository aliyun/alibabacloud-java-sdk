// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class UpdateResourceTypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateResourceTypeResponseBody body;

    public static UpdateResourceTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceTypeResponse self = new UpdateResourceTypeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceTypeResponse setBody(UpdateResourceTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceTypeResponseBody getBody() {
        return this.body;
    }

}
