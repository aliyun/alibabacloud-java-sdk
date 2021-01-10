// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelAKSPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelAKSPlanResponseBody body;

    public static CancelAKSPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelAKSPlanResponse self = new CancelAKSPlanResponse();
        return TeaModel.build(map, self);
    }

    public CancelAKSPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelAKSPlanResponse setBody(CancelAKSPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelAKSPlanResponseBody getBody() {
        return this.body;
    }

}
