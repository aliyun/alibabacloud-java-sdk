// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class UpdateStackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateStackResponseBody body;

    public static UpdateStackResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateStackResponse self = new UpdateStackResponse();
        return TeaModel.build(map, self);
    }

    public UpdateStackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateStackResponse setBody(UpdateStackResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateStackResponseBody getBody() {
        return this.body;
    }

}
