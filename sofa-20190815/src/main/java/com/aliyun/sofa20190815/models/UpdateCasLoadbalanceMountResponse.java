// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateCasLoadbalanceMountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCasLoadbalanceMountResponseBody body;

    public static UpdateCasLoadbalanceMountResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCasLoadbalanceMountResponse self = new UpdateCasLoadbalanceMountResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCasLoadbalanceMountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCasLoadbalanceMountResponse setBody(UpdateCasLoadbalanceMountResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCasLoadbalanceMountResponseBody getBody() {
        return this.body;
    }

}
