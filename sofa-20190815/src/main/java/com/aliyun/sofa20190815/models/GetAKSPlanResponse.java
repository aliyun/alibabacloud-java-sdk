// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAKSPlanResponseBody body;

    public static GetAKSPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAKSPlanResponse self = new GetAKSPlanResponse();
        return TeaModel.build(map, self);
    }

    public GetAKSPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAKSPlanResponse setBody(GetAKSPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAKSPlanResponseBody getBody() {
        return this.body;
    }

}
