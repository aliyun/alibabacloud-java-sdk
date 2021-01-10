// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteCasLoadbalanceMountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCasLoadbalanceMountResponseBody body;

    public static DeleteCasLoadbalanceMountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasLoadbalanceMountResponse self = new DeleteCasLoadbalanceMountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCasLoadbalanceMountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCasLoadbalanceMountResponse setBody(DeleteCasLoadbalanceMountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCasLoadbalanceMountResponseBody getBody() {
        return this.body;
    }

}
