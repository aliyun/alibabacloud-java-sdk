// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateAKSNodeTaintResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAKSNodeTaintResponseBody body;

    public static UpdateAKSNodeTaintResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAKSNodeTaintResponse self = new UpdateAKSNodeTaintResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAKSNodeTaintResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAKSNodeTaintResponse setBody(UpdateAKSNodeTaintResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAKSNodeTaintResponseBody getBody() {
        return this.body;
    }

}
