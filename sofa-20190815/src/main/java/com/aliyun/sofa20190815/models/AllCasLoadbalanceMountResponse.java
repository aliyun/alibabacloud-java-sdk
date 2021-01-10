// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AllCasLoadbalanceMountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AllCasLoadbalanceMountResponseBody body;

    public static AllCasLoadbalanceMountResponse build(java.util.Map<String, ?> map) throws Exception {
        AllCasLoadbalanceMountResponse self = new AllCasLoadbalanceMountResponse();
        return TeaModel.build(map, self);
    }

    public AllCasLoadbalanceMountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllCasLoadbalanceMountResponse setBody(AllCasLoadbalanceMountResponseBody body) {
        this.body = body;
        return this;
    }
    public AllCasLoadbalanceMountResponseBody getBody() {
        return this.body;
    }

}
