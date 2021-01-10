// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSPlanStatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAKSPlanStatesResponseBody body;

    public static GetAKSPlanStatesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAKSPlanStatesResponse self = new GetAKSPlanStatesResponse();
        return TeaModel.build(map, self);
    }

    public GetAKSPlanStatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAKSPlanStatesResponse setBody(GetAKSPlanStatesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAKSPlanStatesResponseBody getBody() {
        return this.body;
    }

}
