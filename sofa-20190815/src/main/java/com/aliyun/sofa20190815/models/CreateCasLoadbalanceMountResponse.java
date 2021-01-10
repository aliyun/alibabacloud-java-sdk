// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateCasLoadbalanceMountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCasLoadbalanceMountResponseBody body;

    public static CreateCasLoadbalanceMountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCasLoadbalanceMountResponse self = new CreateCasLoadbalanceMountResponse();
        return TeaModel.build(map, self);
    }

    public CreateCasLoadbalanceMountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCasLoadbalanceMountResponse setBody(CreateCasLoadbalanceMountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCasLoadbalanceMountResponseBody getBody() {
        return this.body;
    }

}
