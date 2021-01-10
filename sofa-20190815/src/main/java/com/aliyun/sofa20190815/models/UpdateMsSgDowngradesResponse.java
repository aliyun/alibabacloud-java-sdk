// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsSgDowngradesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsSgDowngradesResponseBody body;

    public static UpdateMsSgDowngradesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsSgDowngradesResponse self = new UpdateMsSgDowngradesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsSgDowngradesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsSgDowngradesResponse setBody(UpdateMsSgDowngradesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsSgDowngradesResponseBody getBody() {
        return this.body;
    }

}
